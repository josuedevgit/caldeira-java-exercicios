package exercicio03;

public abstract class Conta {
    private double saldo;

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract double obterSaldo();
}
