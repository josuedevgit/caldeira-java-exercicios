import java.util.Scanner;

public class FaltaParaMeiaNoite {

    public static void main(String[] args) {

        int hora, minuto, segundo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora atual [0-23]:");
        hora = sc.nextInt();

        System.out.println("Digite os minutos [0-59]:");
        minuto = sc.nextInt();

        System.out.println("Digite os segundos [0-59]:");
        segundo = sc.nextInt();

        if(hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {

            int segundosPassadosMeiaNoite = hora * 3600 + minuto * 60 + segundo;

            int faltaParaMeiaNoite = 86400 - segundosPassadosMeiaNoite;

            System.out.println("Segundos passados desde 0h00min00s: " + segundosPassadosMeiaNoite);
            System.out.println("Segundos faltando para meia-noite: " + faltaParaMeiaNoite);

        } else {
            System.out.println("Entrada de tempo inválida!");
        }

        sc.close();
    }
}
