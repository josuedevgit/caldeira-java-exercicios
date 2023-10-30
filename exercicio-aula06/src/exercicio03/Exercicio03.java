package exercicio03;

import java.util.*;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Calendar> phoneList = new TreeMap<>();
        String name, number, address, cityLocal;

        System.out.println("Adicione números à lista telefônica!");
        System.out.print("Digite o nome (ou deixe em branco para encerrar): ");
        name = scanner.nextLine();

        while (!name.isEmpty()) {
            System.out.print("Digite o número de telefone: ");
            number = scanner.nextLine();
            System.out.print("Digite o endereço: ");
            address = scanner.nextLine();
            System.out.print("Digite a região: ");
            cityLocal = scanner.nextLine();
            System.out.println();
            System.out.println("------------------------------");
            System.out.println();
            phoneList.put(name, new Calendar(number, address, cityLocal));

            System.out.print("Digite o nome (ou deixe em branco para encerrar): ");
            name = scanner.nextLine();
        }



        List<String> sortedKeys = new ArrayList<>(phoneList.keySet());
        Collections.sort(sortedKeys);

        // Imprimir os contatos em ordem alfabética
        System.out.println("Lista de contatos em ordem alfabética: ");
        System.out.println("------------------------------");
        for (String contatoNome : sortedKeys) {
            Calendar contato = phoneList.get(contatoNome);
            System.out.println("Nome: " + contatoNome);
            System.out.println("Número de Telefone: " + contato.getNumber());
            System.out.println("Endereço: " + contato.getAddress());
            System.out.println("Região: " + contato.getCityLocal());
            System.out.println();
        }
        System.out.println("------------------------------");

        System.out.println();
        System.out.print("Digite a região para imprimir contatos: ");
        String region = scanner.nextLine();
        printContactsByRegion(phoneList, "sul");
    }

    public static void printContactsByRegion(Map<String, Calendar> phoneList, String region) {
        for (Map.Entry<String, Calendar> contact : phoneList.entrySet()) {
            if (contact.getValue().getCityLocal().equals(region)) {
                System.out.println("Região: " + contact.getValue().getCityLocal());
                System.out.println("Nome: " + contact.getKey());
                System.out.println("Número: " + contact.getValue().getNumber());
                System.out.println("Endereço: " + contact.getValue().getAddress());
                System.out.println("------------------------------");
                System.out.println();
            }
        }
    }
}
