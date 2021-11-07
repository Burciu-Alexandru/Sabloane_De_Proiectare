package tema;

import java.util.ArrayList;

public class Author {
	private String name;
	
	public Author(String name)
	{
		this.name=name;
	}
	public void setAuthorName(String name)
	{
		this.name=name;
	}
	public void print()
	{
		System.out.println("Author: "+ name);
	}
}