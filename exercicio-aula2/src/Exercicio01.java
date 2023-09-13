import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um num");
        int num1 = sc.nextInt();
        System.out.println("Digite outro");
        int num2 = sc.nextInt();

        for(int i = num1; i < num2; i++) {

            if(i % i == 0 && i % 1 == 0) {
                System.out.println(i);
            }
        }
    }
}