package Leitura;

import java.io.File;
import java.util.Scanner;

public class ManipulationWithFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Escreve um endereço de diretorio:  ");
		
		String strPath = sc.nextLine(); //Vou ler o caminho que o usuario digitou.
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); //Essa função lista as pastas do diretorio, coloca num vetor
			//a função isDirectory especifica que é para lista somente diretorios ou pastas
		//Criado o vetor de pastas contendo cada um dos caminhos das pastas
		
		System.out.println("\n Pastas: ");
		
		for( File folder: folders) {
			System.out.println(folder);
			
		}
		
		System.out.println("\n Arquivos: ");
		//Agora irei criar a lista de arquivos
		File[] files = path.listFiles(File::isFile);//Dessa forma eu pego somento os arquivos
		
		for ( File file : files) {
			System.out.println(file);
		}
		
		//Criando uma Subpasta
		
		boolean success = new File(strPath + "\\subdir").mkdir();//Cria uma subpasta chamada subdir a partir da pasta dada no primeiro input
		System.out.println("Diretorio criado com sucesso -> "+success);
		
		
		
		sc.close();

	}

}
