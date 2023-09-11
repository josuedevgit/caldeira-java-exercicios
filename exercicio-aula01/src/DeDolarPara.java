import java.util.Scanner;

public class DeDolarPara {

    public static void main(String[] args) {
        // converter do dolar, para outra moeda
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a cotação do Dólar no valor da moeda que deseja converter:");
        double cotacaoDolar = sc.nextDouble();
        System.out.println("Qual quantia deseja converter:");
        double valorParaConverter = sc.nextDouble();

        // calcular e mostrar em reais
        double valorConvertido = valorParaConverter * cotacaoDolar;
        System.out.println(valorConvertido);
    }
}
