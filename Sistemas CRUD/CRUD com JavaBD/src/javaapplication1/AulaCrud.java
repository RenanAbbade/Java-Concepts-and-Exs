/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author 31782299
 */
public class AulaCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            out.println("Driver JDBC carregado!");
            
            String url = "jdbc:derby://localhost:1527/faculdade";
            String usuario = "app";
            String senha = "app";
            
            Connection conexao = DriverManager.getConnection(url,usuario,senha);
            out.println("Conexão estabelecida com sucesso!");
            
            String sqlInsert = "INSERT INTO professores(nome, matricula, area)";
            sqlInsert += "VALUES (?,?,?)";
            String sqlSelect = "SELECT * FROM professores";
            String sqlUpdate = "UPDATE professores SET nome=?, matricula=?, area=?";
            sqlUpdate += "WHERE id=?";
            String sqlDelete = "DELETE FROM professores WHERE id=?";
            
            PreparedStatement stmInsert = conexao.prepareStatement(sqlInsert);
            PreparedStatement stmSelect = conexao.prepareStatement(sqlSelect);
            PreparedStatement stmUpdate = conexao.prepareStatement(sqlUpdate);
            PreparedStatement stmDelete = conexao.prepareStatement(sqlDelete);
            
            boolean querSair = false;
            Scanner sc = new Scanner(System.in);
            
            while (!querSair) {
                out.println(" \n menu:");
                out.println("(1) Criar registro");
                out.println("(2) Ler registro");
                out.println("(3) Atualizar registro");
                out.println("(4) Apagar registro");
                out.println("(5) Apagar registro");
                out.println("(6) Sair");
                out.println("Opção escolhida: ");
                int opcao = Integer.parseInt(sc.nextLine());
                if (opcao == 1) {
                    out.print("Nome do novo arquivo: ");
                    String nome = sc.nextLine();
                    out.print("Número de matricula do novo registro: ");
                    int matricula = Integer.parseInt(sc.nextLine());
                    out.print("área do novo registro: ");
                    String area = sc.nextLine();
                    //TODO: incluir registro
                    stmInsert.setString(1,nome);
                    stmInsert.setInt(2, matricula);
                    stmInsert.setString(3,area);
                    int retorno = stmInsert.executeUpdate();
                    out.println("Registros inseridos: "+ retorno);
                }else if(opcao == 2){
                    //Consultar os registros e imprimir na tela
                    ResultSet  rs = stmSelect.executeQuery();
                    out.print("Professores: ");
                    while (rs.next()){
                        Long id = rs.getLong("id");
                        String nome = rs.getString("Nome");
                        int matricula = rs.getInt("Matricula");
                        String area = rs.getString("Area");
                        out.println(id + " -" + nome + " - " + matricula + " - " + area);
                   
                    }
                    rs.close();
                    
                }else if(opcao == 3){
                    out.print("ID do registro a ser atualizado: ");
                    long id = Long.parseLong(sc.nextLine());
                    out.print("novo nome: ");
                    String nome = sc.nextLine();
                    out.print("Novo número de matricula");
                    int matricula = Integer.parseInt(sc.nextLine());
                    out.print("Nova área");
                    String area = sc.nextLine();
                    
                    stmUpdate.setString(1,nome);
                    stmUpdate.setInt(2,matricula);
                    stmUpdate.setString(3,area);
                    stmUpdate.setLong(4,id);
                    int retorno = stmUpdate.executeUpdate();
                    out.println("Registros atualizados: "+retorno);
                    
                } else if (opcao == 4){
                    out.print("id do registro a ser apagado:");
                    long id = Long.parseLong(sc.nextLine());
                    //apagar o registro com esse id
                    stmDelete.setLong(1, id);
                    int retorno = stmDelete.executeUpdate();
                    out.println("Registros apagados: "+ retorno);
                    
                } else if (opcao == 5){
                    querSair = true;
                    
                } else {
                    out.println("INVALID OPTION");
                }
            
            }
            conexao.close();
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
            out.println("Driver not found");
        } catch (SQLException ex){
            ex.printStackTrace();
            out.println("Erro de Conexão");
        }
            
        }
    }
    

