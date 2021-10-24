package Lab_2;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private String titlu;
    private List<Author> autori;
    private List<Chapter> capitole;

    public Book(String titlu) {
        this.titlu = titlu;
        this.capitole = new ArrayList<>();
        this.autori = new ArrayList<>();
    }

    public void addAuthor(Author autor) {
        autori.add(autor);
    }

    public int createChapter(String nume) {
        capitole.add(new Chapter(nume));
        return capitole.size() - 1;
    }

    public Chapter getChapter(int id) {
        return capitole.get(id);
    }

    public void print() {
        System.out.println("Book " + titlu);
        System.out.println("Authors");
        autori.forEach(Author::print);
        System.out.println("Chapters");
        capitole.forEach(Chapter::print);
    }
}