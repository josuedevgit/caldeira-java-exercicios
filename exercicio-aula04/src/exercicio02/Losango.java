package exercicio02;

public class Losango extends FormaGeometrica{

    private double diagonalMenor;
    private double diagonalMaior;

    @Override
    public double cacularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
