package DAO;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("Test 4 - Seller findAll");
		list = sellerDao.findAll();
		for (Seller obj1 : list) {
			System.out.println("obj: "+ obj1);
		}
		System.out.println("Test 5 - Seller INSERT");
		Seller nSeller = new Seller(null, "Saulo", "sauloarono@itauunibanco.com", new Date(), 8000.0, depart);
		sellerDao.insert(nSeller);
		System.out.println("Inserted! new ID = "+ nSeller.getId());
		
		System.out.println("Test 6 - Seller UPDATE");
		seller = sellerDao.findById(1); //Carrego os dados desse ID no meu Seller
		seller.setName("Bruno Barreiro");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("Test 7 - Seller DELETE");
		System.out.println("Entre com um ID para deletar: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed");
		
	}
	
		

}
