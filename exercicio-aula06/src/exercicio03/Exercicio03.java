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

            phoneList.put(name, new Calendar(number, address, cityLocal));

            System.out.print("Digite o nome (ou deixe em branco para encerrar): ");
            name = scanner.nextLine();
        }



        List<String> sortedKeys = new ArrayList<>(phoneList.keySet());
        Collections.sort(sortedKeys);

        // Imprimir os contatos em ordem alfabética
        System.out.println("Lista de contatos em ordem alfabética:");
        for (String contatoNome : sortedKeys) {
            Calendar contato = phoneList.get(contatoNome);
            System.out.println("Nome: " + contatoNome);
            System.out.println("Número de Telefone: " + contato.getNumber());
            System.out.println("Endereço: " + contato.getAddress());
            System.out.println("Região: " + contato.getCityLocal());
            System.out.println();
        }
    }
}
