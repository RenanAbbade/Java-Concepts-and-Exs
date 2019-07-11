package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getBirthDay().getTime()));
			st.setDouble(4, obj.getBaseSalary());
			st.setInt(5, obj.getDepartment().getId());
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			}
			else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
	}
	
	
	
	@Override
	public void update(Seller obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
					+ " WHERE Id = ?");
			
			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getBirthDay().getTime()));
			st.setDouble(4, obj.getBaseSalary());
			st.setInt(5, obj.getDepartment().getId());
			st.setInt(6, obj.getId());
			
			st.executeUpdate();
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
	}
	

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"DELETE FROM seller "
					+ " WHERE Id = ?");
			st.setInt(1, id);
			
			//Criando teste caso o Id n exista
			int linhas = st.executeUpdate();
			
			if (linhas == 0) {//Caso peça pra deletar um ID não existente
				throw new DbException("Codigo inexistente!");
			}
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
		
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
				Department dep = instantiateDepartment(rs); //Para tornar o codigo mais enxuto eu coloquei em métodos as instanciações
				Seller obj = instanciateSeller(rs, dep);
				
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

	
	
	private Seller instanciateSeller(ResultSet rs, Department dep) throws SQLException {//Propagando Exception
		Seller obj = new Seller();//Crio obj Seller apontando para Dept
		
		obj.setId(rs.getInt("Id"));//No caso eu pego o valor da coluna chamada Id
		obj.setName(rs.getString("Name"));
		obj.setEmail(rs.getString("Email"));
		obj.setBaseSalary(rs.getDouble("BaseSalary"));
		obj.setBirthDay(rs.getDate("BirthDate"));
		obj.setDepartment(dep);//Recebe o obj Department que criamos aqui
		
		return obj;
		
	}

	
	
	private Department instantiateDepartment(ResultSet rs) throws SQLException { //Throws eu propago a Exception, para ser tratado no codigo fora da funcao pelo Try/Catch With Resources
		 Department dep = new Department();
			
			dep.setId(rs.getInt("DepartmentId"));//Fiz uma var aux que vai receber a coluna na qual está o Id do departamento
			
			dep.setName(rs.getString("DepName"));//Aqui eu pelo o valor da coluna do nome do departamento
			
		return dep;
	}

	
	
	@Override
	public List<Seller> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "ORDER BY Name");
			
			rs = st.executeQuery();
			
			//Para guardar os valores gerados pelo ResultSet, precisarei de uma lista que sera populada pelo While abaixo
			List<Seller> list = new ArrayList<>();
			//Para controlar a não repetição de obj, criamos este Map
			Map<Integer, Department> map = new HashMap<>();
			
			while (rs.next()) {
				//O meu resultado pode ter 0 ou mais valores, se tornando um While, percorrer o rs enquanto tiver um proximo
				Department dep = map.get(rs.getInt("DepartmentId")); //No map que eu criei, vou guardar qualquer departamento que eu instanciar, e cada vez que passar do While testarei se ele ja existe indo ao meu Map e buscando com o metodo get se já existe um departament com o mesmo id
				//Vou testar se esse departamento já existe(Controle com o objetivo de não criar dois objetos iguais de departamento
				if (dep == null) {//Se o DEP foi igual a nulo, significa que ele nao existia, entao instancio esse dep
					dep = instantiateDepartment(rs); //Para tornar o codigo mais enxuto eu coloquei em métodos as instanciações
					map.put(rs.getInt("DepartmentId"),dep);//Guardando no meu map (key, dep)
				}
				Seller obj = instanciateSeller(rs, dep);
				list.add(obj);

			}
			//Se o RS.NEXT dar nulo, ele vai pular o if e vai dar false, entao vou retornar nulo
			return list;
		}catch ( SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			//Não é necessario fechar a conn pois existem varios metodos que vao necessitar da Conn
		}
	}

	
	
	
	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE DepartmentId = ? "
					+ "ORDER BY Name");
			
			st.setInt(1, department.getId());
			
			rs = st.executeQuery();
			
			//Para guardar os valores gerados pelo ResultSet, precisarei de uma lista que sera populada pelo While abaixo
			List<Seller> list = new ArrayList<>();
			//Para controlar a não repetição de obj, criamos este Map
			Map<Integer, Department> map = new HashMap<>();
			
			while (rs.next()) {
				//O meu resultado pode ter 0 ou mais valores, se tornando um While, percorrer o rs enquanto tiver um proximo
				Department dep = map.get(rs.getInt("DepartmentId")); //No map que eu criei, vou guardar qualquer departamento que eu instanciar, e cada vez que passar do While testarei se ele ja existe indo ao meu Map e buscando com o metodo get se já existe um departament com o mesmo id
				//Vou testar se esse departamento já existe(Controle com o objetivo de não criar dois objetos iguais de departamento
				if (dep == null) {//Se o DEP foi igual a nulo, significa que ele nao existia, entao instancio esse dep
					dep = instantiateDepartment(rs); //Para tornar o codigo mais enxuto eu coloquei em métodos as instanciações
					map.put(rs.getInt("DepartmentId"),dep);//Guardando no meu map (key, dep)
				}
				Seller obj = instanciateSeller(rs, dep);
				list.add(obj);

			}
			//Se o RS.NEXT dar nulo, ele vai pular o if e vai dar false, entao vou retornar nulo
			return list;
		}catch ( SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			//Não é necessario fechar a conn pois existem varios metodos que vao necessitar da Conn
		}
	}

}
