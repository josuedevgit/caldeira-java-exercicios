import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Digite um texto:");

        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        sc.close();

        String textoInvertido = new StringBuilder(texto).reverse().toString();
        System.out.println("O texto invertido: " + textoInvertido);
    }
}
