package atualizarDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		PreparedStatement st = null;
		//Aumentando o salario do vendedor
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary ="
					+ "BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?) ");
			
			st.setDouble(1, 400);
			st.setInt(2, 2);
			
			int linhas = st.executeUpdate();
			
			System.out.println("Linhas afetadas: "+linhas);
			

			
					
		}catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		}
		
	}


