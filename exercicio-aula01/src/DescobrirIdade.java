import java.util.Scanner;

public class DescobrirIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu ano de nascimento:");
        int anoDeNascimento = sc.nextInt();
        System.out.println("Insira o ano em que você está:");
        int anoAtual = sc.nextInt();
        sc.close();

        System.out.println("--------------------------");
        System.out.println("Você tem ou vai fazer " + (anoAtual - anoDeNascimento) + " anos.");
    }
}
