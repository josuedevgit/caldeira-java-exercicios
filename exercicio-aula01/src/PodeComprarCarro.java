import java.util.Scanner;

public class PodeComprarCarro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos verificar se podes adquirir o veículo!");
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("Digite seu salário:");
        double salario = sc.nextDouble();
        sc.close();

        if(idade >= 18 && salario >= 2000.0) {
            System.out.println("Pode adquirir o veículo!");
        } else {
            System.out.println("Não é possível adquirir o veículo no momento.");
        }
    }
}
