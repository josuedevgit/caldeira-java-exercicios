import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = sc.nextLine();
        sc.close();

        int comprimento = texto.length();
        int meio = comprimento / 2;

        String primeiraParte = texto.substring(0, meio);
        System.out.println("A primeira parte do texto dividido: " + primeiraParte);

    }
}
