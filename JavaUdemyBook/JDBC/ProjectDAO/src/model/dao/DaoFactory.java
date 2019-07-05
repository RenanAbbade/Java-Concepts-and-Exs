package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {//Fábrica de DAO
	//Essa classe vai ter métodos estaticos para instanciar os DAOs
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(); 
		//Dessa forma a classe vai internamente instanciar
		//a implementacao
	}

}
