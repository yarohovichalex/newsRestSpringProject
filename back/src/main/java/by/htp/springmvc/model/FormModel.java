package by.htp.springmvc.model;

public class FormModel {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	
	public FormModel() {
	}

	public FormModel(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	
	
}
