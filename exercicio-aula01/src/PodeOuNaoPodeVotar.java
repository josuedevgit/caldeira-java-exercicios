import java.util.Scanner;

public class PodeOuNaoPodeVotar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos verificar se podes votar! Digite sua idade:");
        int idade = sc.nextInt();
        sc.close();

        if(idade < 16) {
            System.out.println("Você não pode votar! Sua idade ainda não é suficiente");
        } else if(idade >= 16 && idade <= 17 || idade >= 65) {
            System.out.println("Voto é opcional!");
        } else {
            System.out.println("Voto obrigatório, como dever cívico!");
        }
    }
}
