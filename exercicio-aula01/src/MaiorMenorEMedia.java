import java.util.Scanner;

public class MaiorMenorEMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int primeNum = sc.nextInt();

        System.out.println("Digite outro número:");
        int segNum = sc.nextInt();

        System.out.println("Digite mais um:");
        int terNum = sc.nextInt();

        sc.close();

        int maiorValor = primeNum;
        if (segNum > maiorValor) {
            maiorValor = segNum;
        }
        if (terNum > maiorValor) {
            maiorValor = terNum;
        }

        int menorValor = primeNum;
        if(segNum < menorValor) {
            menorValor = segNum;
        }
        if(terNum < menorValor) {
            menorValor = terNum;
        }

        int media = (primeNum + segNum + terNum) / 3;

        System.out.println("O maior é: " + maiorValor);
        System.out.println("O menor é: " + menorValor);
        System.out.println("A média dos números é: " + media);
    }
}
