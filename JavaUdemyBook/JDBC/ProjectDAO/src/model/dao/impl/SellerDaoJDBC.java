package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DAO.DB;
import DAO.DbException;
import DAO.Department;
import DAO.Seller;
import model.dao.SellerDao;

public class SellerDaoJDBC implements SellerDao {
		
	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;//Este RS tá apontando pra posicao 0
		try {
			st = conn.prepareStatement(""
					+ "SELECT seller.*,department.Name as DepName  FROM seller INNER JOIN department  ON seller.DepartmentId = department.Id  WHERE seller.Id = ?"  
					);
			
			st.setInt(1, id);
			rs = st.executeQuery();
			//O ResultSet tras os resultados em formato de tabela, a classe DAO é responsavel por transformar essa tabela em um objeto
			//Para apontar para a posicao 1, fazemos o seguinte:
			if ( rs.next() ) {
				//Testar se veio algum resultado, se o IF vier significa que nao veio nulo
				Department dep = new Department();
				
				dep.setId(rs.getInt("DepartmentId"));//Fiz uma var aux que vai receber a coluna na qual está o Id do departamento
				
				dep.setName(rs.getString("DepName"));//Aqui eu pelo o valor da coluna do nome do departamento
				
				Seller obj = new Seller();//Crio obj Seller apontando para Dept
				
				obj.setId(rs.getInt("Id"));//No caso eu pego o valor da coluna chamada Id
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				obj.setBaseSalary(rs.getDouble("BaseSalary"));
				obj.setBirthDay(rs.getDate("BirthDate"));
				obj.setDepartment(dep);//Recebe o obj Department que criamos aqui
				
				return obj;//Retornando Vendedor por ID
			}
			//Se o RS.NEXT dar nulo, ele vai pular o if e vai dar false, entao vou retornar nulo
			return null;
		}catch ( SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			//Não é necessario fechar a conn pois existem varios metodos que vao necessitar da Conn
		}
		
		}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
