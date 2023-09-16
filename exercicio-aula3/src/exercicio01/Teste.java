package exercicio01;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.deposito(200);
        System.out.println(conta.verificarInformacoes());
        System.out.println(conta.getHorarioAtual());
    }
}
