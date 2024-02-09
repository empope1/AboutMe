package controller;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Feb 8, 2024
 */
public class Name {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setInput(name);
	}

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Name(String name) {
		super();
		this.name = name;
	}
	
	public void setInput(String name) {
		final String NAME = null;
		
		setName(NAME);
	}
	
	@Override
	public String toString() {
		return "name [name=" + name + "]";
	}
	
	

}
