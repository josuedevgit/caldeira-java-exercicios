package exercicio02;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    @Override
    public double cacularArea() {
        return base * altura;
    }
}
