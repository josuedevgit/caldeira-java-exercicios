package exercicio02;

public class Losango extends FormaGeometrica{
    private double diagonalMenor;
    private double diagonalMaior;

    public Losango(double diagonalMenor, double diagonalMaior) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMaior = diagonalMaior;
    }

    @Override
    public double cacularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
