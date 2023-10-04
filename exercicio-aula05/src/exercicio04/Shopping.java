package exercicio04;

public class Shopping {
    private String name;
    private String expirationDate;

    public Shopping(String name, String expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public String getShop() {
        return "Lista de compras: [Produto: " + name + ", Data de Validade: " + expirationDate + "]";
    }
}
