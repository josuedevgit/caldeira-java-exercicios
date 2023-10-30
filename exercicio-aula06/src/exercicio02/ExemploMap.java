package exercicio02;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args)
    {
        Map<String, Integer> agenda = new HashMap<String, Integer>();
        agenda.put("Luma", 11222);
        agenda.put("Alex", 22333);
        agenda.put("Andrea", 3344);

        System.out.println(agenda.get("Luma"));
    }
}
