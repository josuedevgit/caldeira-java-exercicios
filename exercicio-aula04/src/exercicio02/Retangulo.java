package exercicio02;

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double cacularArea() {
        return base * altura;
    }
}
