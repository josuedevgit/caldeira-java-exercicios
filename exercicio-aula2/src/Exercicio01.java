import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DETERMENAREMOS OS NUMEROS PRIMOS DO INVERVALO:");

        System.out.println("Digite o primeiro numero:");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        int segundoNumero = sc.nextInt();

        System.out.println("Intervalo escolhido: " + primeiroNumero + ", " + segundoNumero);
        System.out.println("Esses são os números primos encontrados:");
        for(int i = primeiroNumero; i <= segundoNumero; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean ehPrimo(int numero){
        if(numero <= 1) {
            return false;
        }

        for(int i = 2; i <= numero - 1; i++) {
            if(numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}