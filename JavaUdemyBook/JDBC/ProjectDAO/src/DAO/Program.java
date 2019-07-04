package DAO;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		/*	Para cada entidade, deve-se ter um objeto
		responsavel por fazer o acesso a dados 
		dessa entidade, realizando o CRUD
		Cada DAO será definido por uma interface
		pois o acesso a dados pode ser flexivel
		A injeção de dependencia pode ser feita por meio
		do padroa de projeto Factory, responsavel 
		por instanciar implementações do meu DAO
		 */
		Department obj = new Department(1, "Games");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 4000.0, obj);
		
		System.out.println(seller);
		
	}

}
