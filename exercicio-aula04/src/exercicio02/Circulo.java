package exercicio02;

public class Circulo extends FormaGeometrica{

    private double raio;

    @Override
    public double cacularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
