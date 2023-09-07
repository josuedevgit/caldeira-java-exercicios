import java.util.Scanner;
public class ImprimeNome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite teu nome:");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome);
    }
}