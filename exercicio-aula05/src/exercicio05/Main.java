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
        LinkedList<Print> printQueue = new LinkedList<>();

        System.out.println("IMPRIMIR:");
        System.out.println("1. Adicionar a fila de impressão");
        System.out.println("2. Imprimir documentos na fila");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {
            case 1:
                System.out.println("O que você está imprindo:");
                String name = scanner.nextLine();

                System.out.println("Qual o número de páginas?");
                int pageNumber = scanner.nextInt();
                scanner.nextLine();

                Print print = new Print(name, pageNumber);
                printQueue.add(print);
                System.out.println("Adicionado a fila de Impressão!");
                break;
            case 2:
                for (Print printElement : printQueue
                     ) {
                    System.out.println("Imprindo: " + printElement);
                }

                System.out.println("Documentos impressos!");
                break;
            default:
                System.out.println("Dado Inválido, tente novamente!");
        }
    }
}
