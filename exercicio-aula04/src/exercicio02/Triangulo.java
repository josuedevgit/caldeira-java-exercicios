package exercicio02;

public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double cacularArea() {
        return (base * altura) / 2;
    }
}
