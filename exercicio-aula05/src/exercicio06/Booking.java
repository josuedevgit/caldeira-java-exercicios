package exercicio06;

public class Booking {
    private String name;
    private String local;
    private String cpf;
    private String dateIn;
    private String dateOut;

    public Booking(String name, String local, String cpf, String dateIn, String dateOut) {
        this.name = name;
        this.local = local;
        this.cpf = cpf;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public String getCpf() {
        return cpf;
    }

    public void getBooking() {
        System.out.println("Nome: " + this.name);
        System.out.println("Local: " + this.local);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de entrada: " + this.dateIn);
        System.out.println("Data de saída: " + this.dateOut);
        System.out.println("============================");
    }
}
