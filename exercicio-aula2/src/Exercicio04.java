import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        String loop = "s";
        while(loop.equals("s")) {
            int numero1, numero2;

            Scanner sc = new Scanner(System.in);
            System.out.println("Vamos calcular!");
            System.out.println("Escolha uma operação para aplicar [*, /, +, -]:");
            String operacao = sc.nextLine();

            System.out.println("Digite o primeiro numero:");
            numero1 = sc.nextInt();

            System.out.println("Digite outro numero:");
            numero2 = sc.nextInt();
            sc.nextLine();

            switch(operacao) {
                case "*":
                    int multiplicacao = numero1 * numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
                    break;
                case "/":
                    int divisao = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + divisao);
                    break;
                case "+":
                    int adicao = numero1 + numero2;
                    System.out.println(numero1 + " + " + numero2 + " = " + adicao);
                    break;
                case "-":
                    int subtracao = numero1 - numero2;
                    System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
                    break;
                default:
                    System.out.println("Dado inválido! Digite novamente! [*, /, +, -]");
                    break;
            }
            System.out.println("Você deseja calcular novamente:");
            loop = sc.nextLine();
        }
    }
}
