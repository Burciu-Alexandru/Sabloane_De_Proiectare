package tema;

public class Table implements Element{

	
	private String name;
	public Table(String name)
	{
		this.name=name;
	}
	@Override
	public void print() {
		System.out.println("Table: "+ name);
	}
	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Element get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}