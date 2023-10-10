package exercicio05;

public class Printing {
    private String name;
    private int pageNumbers;

    public Printing(String name, int pageNumbers) {
        this.name = name;
        this.pageNumbers = pageNumbers;
    }

    public void print() {
        System.out.println("Imprindo...");
        System.out.println(this.name + " impresso!");
        System.out.println("-----------------");
    }
}
