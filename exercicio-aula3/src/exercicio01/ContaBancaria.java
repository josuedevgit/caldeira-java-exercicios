package exercicio01;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual = LocalDateTime.now();



    public void saque(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insufiente para saque!");
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void pix(ContaBancaria destino, double valor) {
        if(valor <= this.saldo) {
            destino.saldo += valor;
            this.saldo -= valor;
        } else {
            System.out.println("Erro! Talvez você não tenha saldo suficiente!");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if(valor <= this.saldo && this.horarioAtual.getHour() >= 8 && this.horarioAtual.getHour() <= 19) {
            destino.saldo += valor;
            this.saldo -= valor;
        } else {
            System.out.println("Erro! Você está fora do horário comercial, ou seu saldo é insuficiente para tranferir.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdentificadorConta() {
        return identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getHorarioAtual() {
        int hora = this.horarioAtual.getHour();
        int minuto = this.horarioAtual.getMinute();
        return Integer.toString(hora) + "h" + Integer.toString(minuto);
    }

    public ArrayList<String> verificarInformacoes() {
        ArrayList<String> dados = new ArrayList<>();
        dados.add(this.nome);
        dados.add(this.cpf);
        dados.add(this.identificadorConta);
        dados.add(this.banco);
        dados.add(this.endereco);
        dados.add(Double.toString(this.saldo));
        dados.add(getHorarioAtual());
        return dados;
    }
}
