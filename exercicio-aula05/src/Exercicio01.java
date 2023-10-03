import java.util.Scanner;

public class Exercicio01 {

    /*
    * Crie um programa Java que peça ao usuário para inserir 5 números inteiros e
    * armazene-os em um array. Em seguida, calcule e exiba
    * a soma e a média dos números inseridos.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números abaixo");
        System.out.print("Digite o primeiro número: ");
        numeros[0] = sc.nextInt();

        System.out.print("Digite o segundo: ");
        numeros[1] = sc.nextInt();

        System.out.print("O terceiro: ");
        numeros[2] = sc.nextInt();

        System.out.print("O quarto: ");
        numeros[3] = sc.nextInt();

        System.out.print("O quinto: ");
        numeros[4] = sc.nextInt();

        int soma = 0;
        for(int contador : numeros) {
            soma += contador;
        }

        int media = soma / numeros.length;

        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("A média entre os números é: " + media);

        sc.close();
    }
}