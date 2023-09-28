package exercicio02;

public class Circulo {

    private double raio;


    public Circulo(double raio) {
        if(raio > 0) {
            this.raio += raio;
        } else {
            throw new IllegalStateException("O valor do raio não pode ser negativo!");
        }
    }

    public double calcularArea() {
        // Math.PI traz o número de PI e Math.pow calcula a potencia, do primeiro parametro.
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public void definirRaio(double novoRaio) {
        if(novoRaio > 0)
            this.raio += novoRaio;
        else
            throw new IllegalStateException("O raio deve ser um valor positivo!");
    }

    public String paraString() {
        String raio = Double.toString(this.raio);
        String area = Double.toString(calcularArea());
        String circunferencia = Double.toString(calcularCircunferencia());

        return "Raio: " + raio + ", " + "Area: " + area + ", " + "Circunferência: " + circunferencia;
    }

    public boolean saoIguais(Circulo outroCirculo) {
        return this.raio == outroCirculo.raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularAreaSombreada(Circulo outroCirculo) {
        if (this.raio >= outroCirculo.raio) {
            double areaCirculoMaior = this.calcularArea();
            double areaCirculoMenor = outroCirculo.calcularArea();
            return areaCirculoMaior - areaCirculoMenor;
        } else {
            throw new IllegalArgumentException("O raio do primeiro círculo deve ser maior ou igual ao raio do segundo círculo.");
        }
    }

    public static Circulo criarAPartirDeCoordenadas(double x, double y, double raio) {
        double distanciaAoCentro = Math.sqrt(x * x + y * y);
        return new Circulo(distanciaAoCentro + raio);
    }
}
