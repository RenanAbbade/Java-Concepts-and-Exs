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
 * @author Renan
 */
public class Ex2Crud {
    public static void main(String[] args) {
 
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            out.println("Driver JDBC carregado!");
            
            String url = "jdbc:derby://localhost:1527/faculdade";
            String usuario = "app";
            String senha = "app";
            
            Connection conexao = DriverManager.getConnection(url,usuario,senha);
            out.println("Conexão estabelecida com sucesso!");
            
            String sqlInsert = "INSERT INTO disciplinas(nome,codigo)";
            sqlInsert += "VALUES (?,?)";
            String sqlSelect = "SELECT * FROM disciplinas";
            String sqlUpdate = "UPDATE disciplinas SET nome=?, codigo=?";
            sqlUpdate += "WHERE id=?";
            String sqlDelete = "DELETE FROM disciplinas WHERE id=?";
            
            PreparedStatement stmInsert = conexao.prepareStatement(sqlInsert);
            PreparedStatement stmSelect = conexao.prepareStatement(sqlSelect);
            PreparedStatement stmUpdate = conexao.prepareStatement(sqlUpdate);
            PreparedStatement stmDelete = conexao.prepareStatement(sqlDelete);
            
            boolean querSair = false;
            Scanner sc = new Scanner(System.in);
            
            while (!querSair) {
                out.println(" \n menu:");
                out.println("(1) Criar disciplina");
                out.println("(2) Ler disciplina");
                out.println("(3) Atualizar disciplina");
                out.println("(4) Apagar disciplina");
                out.println("(5) Sair");
             
                out.println("Opção escolhida: ");
                int opcao = Integer.parseInt(sc.nextLine());
                if (opcao == 1) {
                    out.print("Nome da nova disciplina: ");
                    String nome = sc.nextLine();
                    out.print("Código da nova disciplina: ");
                    String codigo = sc.nextLine();
                    //TODO: incluir registro
                    stmInsert.setString(1,nome);
                    stmInsert.setString(2,codigo);
                    int retorno = stmInsert.executeUpdate();
                    out.println("Registros inseridos: "+ retorno);
                    
                }else if(opcao == 2){
                    //Consultar os registros e imprimir na tela
                    ResultSet  rs = stmSelect.executeQuery();
                    out.print("Disciplinas criadas: ");
                    while (rs.next()){
                        Long id = rs.getLong("id");
                        String nome = rs.getString("Nome");
                        String codigo = rs.getString("Codigo");
                        out.println(id + " -" + nome +  " - " + codigo);
                   
                    }
                    rs.close();
                    
                }else if(opcao == 3){
                    out.print("ID do registro a ser atualizado: ");
                    long id = Long.parseLong(sc.nextLine());
                    out.print("novo nome: ");
                    String nome = sc.nextLine();
                    out.print("Novo código da disciplina");
                    String codigo = sc.nextLine();
                    stmUpdate.setString(1,nome);
                    stmUpdate.setString(2,codigo);
                    stmUpdate.setLong(3,id);
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
    


    
    
