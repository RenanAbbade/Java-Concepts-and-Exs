package DAO;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date birthDay;
	private Double baseSalary;
	
	//Composição
	private Department department; //Department are composes by Sellers
	
	public Seller() {
	
	}

	public Seller(Integer id, String name, String email, Date birthDay, Double baseSalary, Department department) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDay = birthDay;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDay=" + birthDay + ", baseSalary="
				+ baseSalary + "]";
	}
	
	
	
	
	

}
