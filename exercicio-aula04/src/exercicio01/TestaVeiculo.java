package exercicio01;

public class TestaVeiculo {

    public static void main(String[] args) {

        Carro car = new Carro("Chevrolet", "Celta", 2001);
        System.out.println(car.calcularCustoViagem(200));

        Moto moto = new Moto("Honda", "Fit", 2006);
        System.out.println(moto.calcularCustoViagem(200));

    }
}
