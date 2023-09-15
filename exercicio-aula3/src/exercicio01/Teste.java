package exercicio01;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.deposito(200);

        ContaBancaria conta2 = new ContaBancaria();

        conta.transferencia(conta2, 150);
        System.out.println(conta2.getSaldo());
        System.out.println(conta.getSaldo());

        conta.transferencia(conta2, 60);
    }
}
