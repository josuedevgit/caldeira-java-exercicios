package exercicio03;

import java.util.*;

public class Calendar {
    private Map<String, String> phoneList = new TreeMap<>();
    private String address;
    private String cityLocal;

    public Calendar(Map<String, String> phoneList, String address, String cityLocal) {
        this.phoneList = phoneList;
        this.address = address;
        this.cityLocal = cityLocal;
    }

    public void getPhoneList() {
        // extrai as chaves que sao nomes
        Set<String> names = phoneList.keySet();

        // orderna os nomes em ordem alfabetica
        List<String> ordernedNames = new ArrayList<>(names);
        Collections.sort(ordernedNames);

//        for (Map.Entry<String, String> contact : phoneList.entrySet()) {
//            String name = contact.getKey();
//            String phoneNumber = contact.getValue();
//
//            System.out.println("Lista de contatos:");
//            System.out.println(name + ": " + phoneNumber);
//            System.out.println("----------------------");
//        }
    }
}
