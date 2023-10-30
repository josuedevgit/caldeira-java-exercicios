package exercicio01;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio01 {

    public static void main(String[] args) {
        Book lordOfTheRings = new Book("The Lord of The Rings", "Adventure");
        Book chroniclesOfNarnia = new Book("The Chronicles of Narnia", "Fantasy");
        Book neuromancer = new Book("Neuromancer", "Cyberpunk");
        Book harryPotter = new Book("Harry Potter and The Philosopher's Stone", "Adventure");

        Stack<Book> stackBooks = new Stack();
        stackBooks.push(lordOfTheRings);
        stackBooks.push(chroniclesOfNarnia);
        stackBooks.push(neuromancer);
        stackBooks.push(harryPotter);
        System.out.println("Livros da nossa pilha:");
        System.out.println("----------------------");
        for (Book book : stackBooks) {
            System.out.println("Titulo: " + book.getTitle() + " - Categoria: " + book.getCategory());
            System.out.println();
        }
        System.out.println("----------------------");

        System.out.println("Imprima com base nas categorias");
        System.out.println("Categorias disponíveis:");
        System.out.println("----------------------");
        System.out.println();
        for (Book book : stackBooks) {
            System.out.println(book.getCategory());
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.print("Digite a categoria dos livros que deseja imprimir: ");
        Scanner scanner = new Scanner(System.in);
        String desirableCategory = scanner.nextLine();

        for (Book book : stackBooks) {
            book.printBasedCategory(desirableCategory, book, stackBooks);
            int amountCategory = book.getAmountCategory();
            if(amountCategory == 0) {
                break;
            }
        }

        for (int i = stackBooks.size(); i > 0; i--) {
            stackBooks.pop();
        }

        System.out.println("Removendo itens da pilha...");
        boolean isEmpty = stackBooks.empty();
        if (isEmpty) {
            System.out.println("Pilha vazia");
        }
    }
}
