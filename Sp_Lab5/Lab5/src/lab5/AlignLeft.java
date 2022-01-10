package lab5;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText() + " <- left");
    }
}