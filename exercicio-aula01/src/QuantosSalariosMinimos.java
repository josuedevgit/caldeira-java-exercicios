import java.util.Scanner;

public class QuantosSalariosMinimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1320.0;

        System.out.println("Digite seu salário:");
        double salario = sc.nextDouble();
        sc.close();

        double quantidadeDeSalarios =  salario / salarioMinimo;

        if(quantidadeDeSalarios < 1.0) {
            System.out.println("Menos de 1 salário mínimo :(");
        }
        if(quantidadeDeSalarios > 10.0) {
            System.out.println("Mais de 10 salários mínimos!!! (Me empresta uma grana, aí!)");
        }
        System.out.println("Quantidade de salários mínimos é: " + (Math.round(quantidadeDeSalarios * 10.0) / 10.0));
    }
}
