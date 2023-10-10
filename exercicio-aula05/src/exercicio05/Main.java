package exercicio05;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    /*
    * Crie um programa Java que simule um sistema de fila de impressão. O programa deve permitir que os usuários
    * adicionem documentos à fila de impressão e, em seguida, imprimir documentos da fila. Use uma LinkedList para
    * representar a fila de  impressão. Impressão deve ser uma classe do seu código com os atributos: nome e numero de
    * páginas e métodos que você julgue necessários.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Printing> printQueue = new LinkedList<>();
        String yesOrNo = "s";

        while(yesOrNo.equals("s")) {
            System.out.println("IMPRIMIR:");
            System.out.println("1. Adicionar a fila de impressão");
            System.out.println("2. Imprimir documentos na fila");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("O que você está imprindo:");
                    String name = scanner.nextLine();

                    System.out.println("Qual o número de páginas?");
                    int pageNumber = scanner.nextInt();
                    scanner.nextLine();

                    Printing print = new Printing(name, pageNumber);
                    printQueue.add(print);
                    System.out.println("Adicionado a fila de Impressão!");
                    break;
                case 2:
                    for (Printing printElement : printQueue
                    ) {
                        printElement.print();
                    }

                    System.out.println("Documentos impressos!");
                    break;
                default:
                    System.out.println("Dado Inválido, tente novamente!");
            }
            System.out.println("Digite 's' para continuar e imprimir");
            System.out.println("Ou 'n' para sair do programa");
            yesOrNo = scanner.nextLine();
        }
    }
}
