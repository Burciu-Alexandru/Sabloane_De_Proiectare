package Lab_2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String nume;
    private List<SubChapter> subCapitole;

    public Chapter(String nume) {
        this.nume = nume;
        this.subCapitole = new ArrayList<>();
    }

    public int createSubChapter(String nume) {
        subCapitole.add(new SubChapter(nume));
        return subCapitole.size() - 1;
    }

    public SubChapter getSubChapter(int id) {
        return subCapitole.get(id);
    }

    public void print() {
        System.out.println("Chapter " + nume);
        subCapitole.forEach(SubChapter::print);
    }
}
