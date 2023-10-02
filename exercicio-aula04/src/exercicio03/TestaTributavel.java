package exercicio03;

public class TestaTributavel {

    public static void main(String[] args) {
        // teste das contas e da implementação da interface e metodo
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        contaCorrente.depositar(200);
        contaCorrente.sacar(75);

        contaPoupanca.depositar(1080);
        contaPoupanca.sacar(640);

        System.out.println("Saldo atual da Conta Corrente: " + contaCorrente.obterSaldo());
        System.out.println("Saldo atual da Conta Poupança: " + contaPoupanca.obterSaldo());
        System.out.println("Tributos da Conta Corrente: " + contaCorrente.calculaTributos());
        System.out.println("Tributos da Conta Poupança: " + contaPoupanca.calculaTributos());
        System.out.println("Tributos do Seguro de Vida: " + seguroDeVida.calculaTributos());

        System.out.println("==========================");

        // testando o gerenciador de imposto de renda
        GerenciadorDeImpostoDeRenda gerenciadorDeImposto = new GerenciadorDeImpostoDeRenda();

        gerenciadorDeImposto.adicionar(contaCorrente);
        System.out.println("Status: Adicionando Conta Corrente - " + gerenciadorDeImposto.getTotalDeImpostos());
        gerenciadorDeImposto.adicionar(contaPoupanca);
        System.out.println("Status: Adicionando Conta Poupança - " + gerenciadorDeImposto.getTotalDeImpostos());
        gerenciadorDeImposto.adicionar(seguroDeVida);

        System.out.println("Total: " + gerenciadorDeImposto.getTotalDeImpostos());
    }
}
