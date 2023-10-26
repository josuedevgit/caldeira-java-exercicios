package exercicio02;

import java.util.HashMap;
import java.util.Map;

public class Exercicio02 {

    public static void main(String[] args) {
        Map<String, Integer> nameAndAges = new HashMap<>();
        nameAndAges.put("Angela", 32);
        nameAndAges.put("Pam", 32);
        nameAndAges.put("Dwight", 38);
        nameAndAges.put("Jim", 85);

        int nameValue = nameAndAges.get("Jim");
        System.out.println("A idade de Jim é: " + nameValue);

        printAgedPeople("mico", nameAndAges);
    }

    public static void printAgedPeople(String key, Map<String, Integer> nameAndAges) {
        int keyValue = 0;
        if(nameAndAges.containsKey(key)) {
            keyValue = nameAndAges.get(key);

            String keyName = null;
            for (Map.Entry<String, Integer> mapIndex : nameAndAges.entrySet()) {
                if (key.equals(mapIndex.getKey()) && keyValue >= 60) {
                    keyName = mapIndex.getKey();
                }
            }

            if(!keyName.isEmpty()) {
                System.out.println(key + " tem " + keyValue + " anos.");
            }
        } else {
            System.out.println("--------------------");
            System.out.println("Nome não encontrado!");
        }

    }
}
