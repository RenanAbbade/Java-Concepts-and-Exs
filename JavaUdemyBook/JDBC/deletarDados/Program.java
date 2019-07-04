package deletarDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) {
		//Deletar dados
		Connection conn = null;
		
		PreparedStatement st = null;
		//Aumentando o salario do vendedor
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM seller "
					+"WHERE Id = ? ");
			
			st.setInt(1, 5);
			
			int linhas = st.executeUpdate();
			
			System.out.println("Linhas afetadas: "+linhas);
			

			
					
		}catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
			//Lançando Exception personalizada
			
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		}
		
	}


