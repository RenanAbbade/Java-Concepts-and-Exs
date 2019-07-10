package DAO;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;

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
		System.out.println("--- Test 1: Seller findById ---");
		Department obj = new Department(1, "Games");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//Aqui vou chamar a fabrica de DAOS, meu programa n conhece a implementacao, somente a interface
		
		System.out.println("--- Test 1: Seller findById ---");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("Test 3 - Seller findByDep");
		Department depart = new Department(2, null);
		List <Seller> list = sellerDao.findByDepartment(depart);
		for (Seller obj1 : list) {
			System.out.println("obj: "+ obj1);
		}
	}

}
