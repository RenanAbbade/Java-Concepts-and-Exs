package Leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAndBuffered_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\Dell\\Documents\\GitHub\\JAVA\\JavaUdemyBook\\LeituraArquivosBasica\\arq.txt";
		//Chamando a String do caminho do arquivo
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);//Instanciando o FileReader como argumento o caminho do arquivo
			//Stream = sequencia de leitura
			br = new BufferedReader(fr);
			//O BufferedReader é instanciado a partir do FileReader, para deixar mais rapido a leitura
			
			String line = br.readLine();
			
			while (line != null) { //Enquanto linha for diferente de nulo, significa que leu com sucesso
				System.out.println(line);
				line = br.readLine();
				
			}
		}catch ( IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}finally {
			try {
						//Necessário o tratamento de erros pois pode haver uma Exception na hora de fechar os Streams
					if ( br != null) {
						br.close();
					} if ( fr != null) {
						fr.close();
					}
				}catch (IOException e) { // para fechar as Streams
						e.printStackTrace();
	} 	
		}
	}
}


	
