package exercicio03;

public class Task {
    private String title;
    private String date;
    private String description;

    public Task(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getTask() {
        return "Tarefa: [Título: " + title + ", data: " + date + ", descrição: " + description + "]";
    }
}
