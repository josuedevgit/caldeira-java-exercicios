package exercicio04;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicio04 {

    public static void main(String[] args) {

        Map<String, Double> products = new LinkedHashMap<>();

        products.put("Feijão", 6.99);
        products.put("Arroz", 4.95);
        products.put("Açúcar", 4.99);
        products.put("Café", 25.90);
        products.put("Coca-Cola", 6.99);

        System.out.println("Lista de produtos: ");
        System.out.println("----------------------");
        for (Map.Entry<String, Double> product : products.entrySet()) {
            System.out.println("Produto: " + product.getKey());
            System.out.println("Valor: " + product.getValue());
            System.out.println("----------------------");
        }
    }
}
