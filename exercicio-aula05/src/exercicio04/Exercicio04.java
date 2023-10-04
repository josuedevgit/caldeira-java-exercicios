package exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
    /*
    * Crie um programa Java que simule uma lista de compras. O programa deve permitir
    * que o usuário adicione itens à lista, remova itens da lista e exiba a
    * lista de compras atual. Use um ArrayList para armazenar os itens da lista de compras.
    * Compra deve ser uma classe do seu código com os atributos:
    * nome e data de validade e métodos que você julgue necessários.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shopping> items = new ArrayList<>();
        String name, expirationDate, yesOrNo = "s";

        // loop para manter os dados da array, enquanto o programa roda
        while(yesOrNo.equals("s")) {
            System.out.println("Bem vindo à sua Lista de Compras. O que você quer fazer?");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Exibir toda lista de compras");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consumes the line left

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    name = scanner.nextLine();
                    System.out.print("Digite a data de validade [00/00/0000]: ");
                    expirationDate = scanner.nextLine();

                    Shopping shop = new Shopping(name, expirationDate);
                    items.add(shop);
                    System.out.println("Tarefa adicionada com sucesso!");

                    break;
                case 2:
                    System.out.println("Digite o número da tarefa que deseja remover:");
                    for(int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i).getName());
                    }
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consumes the line left

                    if(index >= 0 && index < items.size()) {
                        items.remove(index);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada!");
                    }

                    break;
                case 3:
                    System.out.println("Lista de tarefas:");
                    for(int i = 0; i < items.size(); i++) {
                        System.out.println("Tarefa " + (i + 1) + ":");
                        System.out.println(items.get(i).getShop());
                    }
                    break;
                default:
                    System.out.println("Opção Inválida. Tente novamente!");
            }

            System.out.println("Desaja continuar no programa? [s/n]");
            yesOrNo = scanner.nextLine();
            if (yesOrNo.equals("n")) {
                System.out.println("Saindo do programa.");
            }
        }
        scanner.close();
    }
}
