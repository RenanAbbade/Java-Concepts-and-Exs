package inserirDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) {
		/*
		 * PreparedStatemnt: Permite montar a consulta SQL deixando os parametros para colocar depois
		 * executeUpdate: Executar atualização
		 * Statement.RETURN_GENERATED_KEYS: Visa permitir que o ID do novo objeto criado seja recuperado
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS
					);
			//Return generatedKeys para retornar o ID do valor inserido
			//Instancio o PreparedStatement
			//Insiro comandos para trocar os ? pelos valores
			
			st.setString(1, "Renan Abbade");
			st.setString(2, "renanabbade1997@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("18/08/1997").getTime()));//Instanciar uma data para o JDBC deve se usar o java.sql.Date
			st.setDouble(4, 2250.00);
			st.setInt(5, 4);
			
			st.executeUpdate();//Quando é uma operação que iremos alterar os dados, deve ser chamado o 
			//exceuteUpdate que devolve o num de linhas alteradas
			
			
			st = conn.prepareStatement(//Inserindo 2 valores ao mesmo tempo
					"insert into department (Name) values ('d1'), ('d2')",
					Statement.RETURN_GENERATED_KEYS
					);
			
			int rows = st.executeUpdate();//Variavel que recebe o total de linhas alteradas
			
			System.out.println("linhas alteradas "+rows);
			
			if (rows > 0) {
				ResultSet rs = st.getGeneratedKeys(); //Retorna o objeto do tipo ResultSet
				while (rs.next()) {
					int id = rs.getInt(1);//Posição/numero 1 siginica que eu quero os valores das primeiras colunas na qual o ID está
					System.out.println("Feito! ID: "+id);
				}
			}else {
				System.out.println("Nenhuma linha alterada");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();//Sempre fechar a conexão por ultimo
		}
		
		
		
		}
		
	}


