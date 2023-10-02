package exercicio03;

public class SeguroDeVida implements Tributavel{
    private double tributacao = 42.00;

    @Override
    public double calculaTributos() {
        return tributacao;
    }
}
