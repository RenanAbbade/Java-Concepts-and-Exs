package recuperarDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		Statement st = null;
		
		ResultSet rs = null;
		
		try {
			
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from department");
			//O Result Set recebe o resultado da consulta do Statement
			
			while (rs.next()) {
				//O next retorna falso se estiver no ultimo, então o while vai funcionar enquanto existir um PROXIMO
				System.out.println(rs.getInt("id") + ","+ rs.getString("Name"));
				
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//Criando métodos para fechar o ResultSet & Statement, na classe DB
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
			
		}
		
	}


