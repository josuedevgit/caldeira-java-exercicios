import java.util.Scanner;

public class ExibirFilasPrioritarias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos verificar se podes acessar as filas prioritarias. Digite o número de uma das opções:");
        System.out.println("1. Gestante");
        System.out.println("2. Idoso(a)");
        System.out.println("3. PCD");
        System.out.println("4. Nenhuma das opções");
        int opcao = sc.nextInt();
        sc.close();

        switch(opcao) {
            case 1:
                System.out.println("Gestante! Tem acesso à fila preferencial!");
                break;
            case 2:
                System.out.println("Idoso(a). Tem acesso à fila preferencial!");
                break;
            case 3:
                System.out.println("PCD. Tem acesso à fila preferencial!");
                break;
            case 4:
                System.out.println("Você não tem acesso à fila preferencial!");
                break;
            default:
                System.out.println("Dado Inválido. Selecione uma das opções!");
        }

    }
}
