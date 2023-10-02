package exercicio03;

public class ContaCorrente extends Conta implements Tributavel{
    private double saldo;

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double obterSaldo() {
        return this.saldo;
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }
}
