package exercicio01;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.deposito(200);
        conta.saque(150);
        conta.saque(150);
        conta.getHour().getHour();
        System.out.println(conta.getSaldo());
    }
}
