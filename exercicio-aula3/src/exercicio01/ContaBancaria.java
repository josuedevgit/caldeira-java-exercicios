package exercicio01;

import java.time.LocalDateTime;

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

    public void pix(double valor) {
        if(valor <= this.saldo) {
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

    public double verificarSaldo() {
        return this.saldo;
    }

    public LocalDateTime verificarHorario() {
        return this.horarioAtual;
    }

    // espaço para o método verificarInformacoes()
}
