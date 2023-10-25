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

        printAgedPeople("Jim", nameAndAges);
    }

    public static void printAgedPeople(String key, Map<String, Integer> nameAndAges) {
        int keyValue = nameAndAges.get(key);

        if(keyValue >= 60) {
            System.out.println(nameAndAges.get(key));
        }

//        for (Map.Entry<String, Integer> be : nameAndAges.entrySet()) {
//            if (key.equals(be.getKey())) {
//
//            }
//        }

    }
}
