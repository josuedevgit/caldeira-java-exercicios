package exercicio01;

import java.util.Stack;

public class Book {
    private String title;
    private String category;
    private int amountCategory;

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public int getAmountCategory() {
        return amountCategory;
    }

    public void printBasedCategory(String category, Book book, Stack<Book> stackBooks) {
        String bookCategory = book.getCategory();
        boolean isThereCategory = bookCategory.equals(category);

        amountCategory = 0;

        for (Book bookEnable : stackBooks) {
            if (bookEnable.getCategory().equals(category)) {
                amountCategory++;
            }
        }

        if (isThereCategory) {
            System.out.println(book.getTitle());
        }


        if(amountCategory == 0) {
            System.out.println("Categoria '" + category + "' não encontrada");
            System.out.println();
            System.out.println("----------------------");
            return;
        }

    }
}
