package exercicio01;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(
                "Josué",
                "000000000",
                "0000",
                "Inter"
        );
        System.out.println(conta.getHorarioAtual());

        conta.deposito(200);
        conta.deposito(500);


        ContaBancaria conta2 = new ContaBancaria(
                "Josias",
                "000000000",
                "0002",
                "NuBank"
        );

        conta.pix(conta2, 20);
        conta.transferencia(conta2, 200);
        conta.saque(300);

        conta.exibirHistoricoTransacoes();
    }
}
