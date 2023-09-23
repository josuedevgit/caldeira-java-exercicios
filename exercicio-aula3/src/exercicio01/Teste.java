package exercicio01;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(
                "Josué",
                "00000000000",
                "0000",
                "Inter"
        );
        System.out.println(conta.getHorarioAtual());
    }
}
