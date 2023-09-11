import java.util.Scanner;

public class ContarVogaisDePalavra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase, contarei as vogais dela:");
        String palavraOuFrase = sc.nextLine();
        int vogaisContadas = contarVogais(palavraOuFrase);
        System.out.println("Tem " + vogaisContadas + " vogais no texto digitado.");
        sc.close();
    }

    public static int contarVogais(String palavraOuFrase) {
        int contador = 0;
        palavraOuFrase = palavraOuFrase.toLowerCase();

        for(int i = 0; i < palavraOuFrase.length(); i++) {
            char caractere = palavraOuFrase.charAt(i);

            if(Character.toString(caractere).equals("a") || Character.toString(caractere).equals("e") || Character.toString(caractere).equals("i") || Character.toString(caractere).equals("o") || Character.toString(caractere).equals("u")) {
                contador++;
            }
        }
        return contador;
    }
}
