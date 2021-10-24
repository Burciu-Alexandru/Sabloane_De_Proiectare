package Lab_2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private List<Element> elemente;
    private String nume;

    public SubChapter(String nume) {
        this.nume = nume;
        this.elemente = new ArrayList<>();
    }

    public void print() {
        System.out.println("Subchapter " + nume);
        elemente.forEach(Element::print);
    }

    public void createNewParagraph(String text) {
        elemente.add(new Paragraph(text));
    }

    public void createNewImage(String image) {
        elemente.add(new Image(image));
    }

    public void createNewTable(String title) {
        elemente.add(new Table(title));
    }
}
