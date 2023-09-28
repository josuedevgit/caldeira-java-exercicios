package exercicio02;

public class Teste {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(8);

        System.out.println(circulo.calcularArea());

        System.out.println(circulo.calcularCircunferencia());

        circulo.definirRaio(21);

        System.out.println(circulo.paraString());
    }
}
