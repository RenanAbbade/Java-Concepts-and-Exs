package model.dao;

import DAO.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {//Fábrica de DAO
	//Essa classe vai ter métodos estaticos para instanciar os DAOs
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection()); 
		//Dessa forma a classe vai internamente instanciar
		//a implementacao
	}
	
	public static DepartmentDAO createDepDao() {
		return new DepartmentDaoJDBC(DB.getConnection()); 
		//Dessa forma a classe vai internamente instanciar
		//a implementacao
	}

}
