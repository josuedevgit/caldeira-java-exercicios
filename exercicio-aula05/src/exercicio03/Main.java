package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    * Crie um programa Java que permita ao usuário criar uma lista de tarefas. O programa deve permitir adicionar tarefas
    * à lista, remover tarefas e exibir todas as tarefas na lista. Use um ArrayList para armazenar as tarefas.
    * Tarefa deve ser uma classe do seu código com os atributos: titulo, data e descrição
    * e métodos que você julgue necessários.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        String title, date, description, yesOrNo = "s";

        // loop para manter os dados da array, enquanto o programa roda
        while(yesOrNo.equals("s")) {
            System.out.println("Bem vindo à sua Lista de Tarefas. O que você quer fazer?");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir todas as tarefas");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consumes the line left

            switch (choice) {
                case 1:
                    System.out.print("Digite o título: ");
                    title = scanner.nextLine();
                    System.out.print("Digite a data [00/00/0000]: ");
                    date = scanner.nextLine();
                    System.out.print("Digite a descrição: ");
                    description = scanner.nextLine();

                    Task task = new Task(title, date, description);
                    tasks.add(task);
                    System.out.println("Tarefa adicionada com sucesso!");

                    break;
                case 2:
                    System.out.println("Digite o número da tarefa que deseja remover:");
                    for(int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ". " + tasks.get(i).getTitle());
                    }
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consumes the line left

                    if(index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada!");
                    }

                    break;
                case 3:
                    System.out.println("Lista de tarefas:");
                    for(int i = 0; i < tasks.size(); i++) {
                        System.out.println("Tarefa " + i + ":");
                        System.out.println(tasks.get(i).getTask());
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
