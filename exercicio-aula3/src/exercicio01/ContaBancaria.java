package exercicio01;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual = LocalDateTime.now();
    private boolean contaAberta;
    private ArrayList<String> historicoDeTransacoes = new ArrayList<>();



    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco) {
        this.nome = nome;
        if(validaCpf(cpf)) {
            this.cpf = cpf;
        } else {
            fecharConta();
            throw new IllegalStateException("CPF Inválido! Tente novamente");
        }
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.contaAberta = true;
    }

    public boolean validaCpf(String cpf) {
        int soma, multiplicacao, resto, dv1, dv2;
        if(cpf.length() != 11 || cpf.equals("00000000000")){
            return false;
        }

        soma = 0;
        multiplicacao = 10;
        int[] cpfVetor = new int[11];

        for(int i = 0; i < 11; i++) {
            cpfVetor[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }

        for(int i = 0; i < 9; i++) {
            soma += cpfVetor[i] * multiplicacao;
            multiplicacao -= 1;
        }

        resto = soma % 11;
        if(resto < 2) {
            dv1 = 0;
        } else {
            dv1 = 11 - resto;
        }

        // second number
        soma = 0;
        multiplicacao = 11;
        for(int i = 0; i < 10; i++) {
            soma += cpfVetor[i] * multiplicacao;
            multiplicacao -= 1;
        }
        resto = soma % 11;
        if(resto < 2) {
            dv2 = 0;
        } else {
            dv2 = 11 - resto;
        }

        if(cpfVetor[9] == dv1 && cpfVetor[10] == dv2) {
            return true;
        } else {
            return false;
        }
    }


    public void saque(double valor) {
        if(contaAberta) {
            if(valor <= this.saldo) {
                this.saldo -= valor;
                registrarTransacao("Saque de RS$ " + valor);
            } else {
                System.out.println("Saldo insufiente para saque!");
            }
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }
    }

    public void deposito(double valor) {
        if(contaAberta) {
            this.saldo += valor;
            registrarTransacao("Deposito de RS$ " + valor);
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }

    }

    public void pix(ContaBancaria destino, double valor) {
        if(contaAberta) {
            if(valor <= this.saldo) {
                destino.saldo += valor;
                this.saldo -= valor;
                registrarTransacao("Tranferência pix no valor de RS$ " + valor + "para " + destino);
            } else {
                System.out.println("Erro! Talvez você não tenha saldo suficiente!");
            }
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }

    }

    public void transferencia(ContaBancaria destino, double valor) {
        if(contaAberta) {
            if(valor <= this.saldo && this.horarioAtual.getHour() >= 8 && this.horarioAtual.getHour() <= 19) {
                destino.saldo += valor;
                this.saldo -= valor;
                registrarTransacao("Tranferência no valor de RS$ " + valor + "para " + destino);
            } else {
                System.out.println("Erro! Você está fora do horário comercial, ou seu saldo é insuficiente para tranferir.");
            }
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }
    }

    public void alterarEndereco(String novoEndereco) {
        if(contaAberta) {
            this.endereco = novoEndereco;
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }
    }

    public double verificarSaldo() {
        if(contaAberta) {
            return this.saldo;
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }
    }

    public String getHorarioAtual() {
        if(contaAberta) {
            int hora = this.horarioAtual.getHour();
            int minuto = this.horarioAtual.getMinute();
            return Integer.toString(hora) + "h" + Integer.toString(minuto);
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }
    }

    public void verificarInformacoes() {
        if(contaAberta) {
            ArrayList<String> dados = new ArrayList<>();
            dados.add(this.nome);
            dados.add(this.cpf);
            dados.add(this.identificadorConta);
            dados.add(this.banco);
            dados.add(this.endereco);
            dados.add(Double.toString(this.saldo));
            dados.add(getHorarioAtual());
            System.out.println(dados);
        } else {
            throw new IllegalStateException("Você não pode mais usar os recursos da conta, pois ela foi fechada");
        }
    }

    public void fecharConta() {
        this.contaAberta = false;
        this.nome = "";
        this.cpf = "";
        this.identificadorConta = "";
        this.banco = "";
        this.endereco = "";
        this.saldo = 0.0;
    }

    public void registrarTransacao(String transacao) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHora = String.valueOf(LocalDateTime.now());
        historicoDeTransacoes.add(dataHora + " -- " + transacao);
    }

    public void exibirHistoricoTransacoes() {
        if(historicoDeTransacoes.isEmpty()) {
            System.out.println("Não há transações registradas.");
        } else {
            System.out.println("Histórico de Transações:");
            for(String transacao : historicoDeTransacoes) {
                System.out.println(transacao);
            }
        }
    }
}
