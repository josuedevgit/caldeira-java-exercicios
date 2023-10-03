import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

    /*
     * Crie um programa Java que gere automaticamente um array de 10 números inteiros aleatórios entre 1 e 100.
     * Em seguida, peça ao usuário para inserir um número e verifique se esse número está presente no array.
     * Exiba uma mensagem indicando se o número foi encontrado ou não.
     */

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);

        // numeros aleatorias para o array
        int[] numerosAleatorios = new int[10];
        for(int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = aleatorio.nextInt(100) + 1;
        }

        System.out.println("Advinhe o número no array!");
        System.out.print("Digite um número: ");
        int numeroChute = sc.nextInt();

        // encontrando o chute no array
        boolean encontrado = false;
        for(int numero : numerosAleatorios) {
            if(numeroChute == numero) {
                encontrado = true;
                break;
            }
        }
        
        if(encontrado) {
            System.out.println(numeroChute + " está no array!");
        } else {
            System.out.println(numeroChute + " não está no array!");
        }
    }
}
