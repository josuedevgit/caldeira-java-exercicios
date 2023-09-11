import java.util.Scanner;

public class TemperaturaConvertida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a temperatura atual em graus Celsius:");
        int temperaturaCelsius = sc.nextInt();
        int temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        sc.close();

        System.out.println("Convertido é " + temperaturaFahrenheit + "°F");
    }
}
