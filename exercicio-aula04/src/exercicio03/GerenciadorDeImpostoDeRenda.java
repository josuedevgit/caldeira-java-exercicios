package exercicio03;

public class GerenciadorDeImpostoDeRenda {
    private double totalDeImpostos;

    public void adicionar(Tributavel tributo) {
        this.totalDeImpostos += tributo.calculaTributos();
    }

    public double getTotalDeImpostos() {
        return totalDeImpostos;
    }
}
