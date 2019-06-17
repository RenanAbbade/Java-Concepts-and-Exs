package Exercicios;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Author: Renan Henrique da Silva Abbade
public class Programa {// Lendo a aquivos básico

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("");
		//Este objeto encapsula todo o processo de acessar o arquivo, e o seu caminho
		Scanner sc = null;
		try { //Criando tratamento de Exception 
			sc = new Scanner(file);//Instancio o Scanner para ler o arquivo TXT
			while (sc.hasNextLine()) {//Testando se existe uma proxima linha no arquivo
				//Se existe, to mandado imprimir
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Erro da Exception: " + e.getMessage());
			
		}finally {
			if ( sc != null) {
			sc.close();// Condicional para o caso se houver uma exceção logo na instanciação do Scanner
		}
		}
	}
}

	


