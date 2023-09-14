package exercicio01;

import java.time.LocalDateTime;

public class ContaBancaria {

    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private int saldo;
    private LocalDateTime horarioAtual = LocalDateTime.now();

    public LocalDateTime getHour() {
        return this.horarioAtual;
    }

    public double getSaldo() {
        return this.saldo;
    }

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
}
