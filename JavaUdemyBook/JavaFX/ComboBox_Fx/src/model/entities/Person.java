package model.entities;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String name;
	private String email;
	
	public Person()  {
	}
	
	public Person(Integer Id, String name, String email) {
		this.Id = Id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", email=" + email + "]";
	}
	
}
