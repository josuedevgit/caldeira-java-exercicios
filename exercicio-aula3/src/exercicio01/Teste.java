package exercicio01;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Josué", "000.000.000-07", "0001", "Inter");
        conta.deposito(200);
        conta.alterarEndereco("Rua Josue, 2001");
        System.out.println(conta.verificarInformacoes());
        System.out.println(conta.getHorarioAtual());
        conta.verificarInformacoes();
        conta.deposito(200);
    }
}
