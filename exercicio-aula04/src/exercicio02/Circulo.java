package exercicio02;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double cacularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
