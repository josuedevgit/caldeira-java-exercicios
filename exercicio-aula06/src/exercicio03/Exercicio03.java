package exercicio03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercicio03 {

    public static void main(String[] args) {
        Map<String, String> phoneList = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        // fazer um programa "rotativo"
//        while(true) {
//            switch () {
//
//            }
//        }

        System.out.println("LISTA TELEFONICA");

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Digite seu número de celular: ");
        String phoneNumber = scanner.nextLine();

        phoneList.put(name, phoneNumber);
        System.out.println("--------------------");

        System.out.print("Digite seu endereço: ");
        String address = scanner.nextLine();
        System.out.println();

        System.out.print("Digite sua região: ");
        String localCity = scanner.nextLine();

        Calendar calendar = new Calendar(phoneList, address, localCity);
    }
}
