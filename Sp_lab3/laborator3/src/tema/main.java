package tema;

public class main {

	public static void main(String[] args) {
		Book noapteBuna=new Book("Noapte buna, copii!");
		Author rpGheo=new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		Section cap1=new Section("Capitol 1");
		Section cap11=new Section("Capitol 1.1");
		Section cap111=new Section("Capitol 1.1.1");
		Section cap1111=new Section("SubChapter 1.1.1.1");
		noapteBuna.add(new Paragraph("Multumesc mult celor care...."));
		noapteBuna.add(cap1);
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from chapter1.1"));
		cap11.add(cap111);
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));
		noapteBuna.print();
		}

	}

