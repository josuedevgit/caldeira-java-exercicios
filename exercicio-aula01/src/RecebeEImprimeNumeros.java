import java.util.Scanner;

public class RecebeEImprimeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo:");
        int num2 = sc.nextInt();

        System.out.println("Você digitou: " + num1 + " e " + num2);
    }
}
