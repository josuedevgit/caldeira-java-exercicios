package exercicio02;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double cacularArea() {
        return Math.pow(lado, 2);
    }
}
