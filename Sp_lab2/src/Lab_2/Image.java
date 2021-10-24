package Lab_2;

public class Image implements Element {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    public void print() {
        System.out.println("Image " + image);
    }

}