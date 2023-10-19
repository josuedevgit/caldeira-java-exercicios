package exercicio01;

public class Book {
    private String title;
    private String category;

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

    public void printBasedCategory(String category, Book book) {
        String bookCategory = book.getCategory();
        if (bookCategory.equals(category)) {
            System.out.println(book.getTitle());
        }

    }
}
