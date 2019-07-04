package transação;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {
		/* Transação = Operação que deve mander a 
		 * consistencia do BD
		 * -Atomomica, Consistencia, Isolação, Durabilidade
		 * - setAutoCommit() - Diz se cada operação isolada vai ser confirmada automaticamente ou nã
		 * commit() - Confirmar a transação
		 * rollback() - Desfazer tudo
		 */
		
		Connection conn = null;
		
		Statement st = null;
		
		ResultSet rs = null;
		
		try {
			
			conn = DB.getConnection();
			//Assim eu atualizo tudo, ou nada, com uma Transação, se as duas derem certo ok, se nao, nada
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int linhasAfetadas = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			//Simulando falha para trabalhar a Transação: Esse erro faz que o Update acima funcione e o abaixo nao, apos isso implementei o commit
//			int x = 1;
//			if (x<2) {
//				throw new SQLException("Fake Error");
//			}
			
			int linhasAfetadas2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();//Para confirmar que a minha transação terminou
			
			System.out.println("linhas "+linhasAfetadas);
			System.out.println("linhas "+linhasAfetadas2);
			
		}catch (SQLException e) {
			//Lógica para voltar a transação caso ela tenha parado
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! cause by: "+e.getMessage());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new DbException("Error trying to rollback! Cause by : "+e.getMessage());
			}
		} finally {
			//Criando métodos para fechar o ResultSet & Statement, na classe DB
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
			
		}
		
	}


