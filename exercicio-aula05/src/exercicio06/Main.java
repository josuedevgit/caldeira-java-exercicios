package exercicio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Booking> bookingTicket = new LinkedList<>();
        String yesOrNo = "s";

        while(yesOrNo.equals("s")) {
            System.out.println("RESERVA DE PASSAGENS");
            System.out.println("1. Reservar passsagens");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir lista de reservas");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Digite seu nome: ");
                    String name = scanner.nextLine();

                    System.out.print("Digite o local da viagem: ");
                    String local = scanner.nextLine();

                    System.out.print("Digite seu cpf: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Digite a data de entrada: ");
                    String dateIn = scanner.nextLine();

                    System.out.print("Digite a data de saida: ");
                    String dateOut = scanner.nextLine();


                    Booking book = new Booking(name, local, cpf, dateIn, dateOut);
                    bookingTicket.add(book);
                    System.out.println("Reversa feita com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o cpf da reserva: ");
                    String bookingCpf = scanner.nextLine();
                    boolean remove = false;
                    for (Booking bookElement : bookingTicket
                    ) {
                        if(bookElement.getCpf().equals(bookingCpf)) {
                            bookingTicket.remove(bookElement);
                            System.out.println("Reserva cancelada com sucesso!");
                            remove = true;
                            break;
                        }
                    }

                    if(!remove) {
                        System.out.println("Reserva não encontrada!");

                    }
                    break;
                case 3:
                    System.out.println("Lista de reservas:");
                    for(Booking bookElement : bookingTicket) {
                        bookElement.getBooking();
                    }
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
