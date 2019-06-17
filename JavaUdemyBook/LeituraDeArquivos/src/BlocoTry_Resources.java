package Leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTry_Resources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Dell\\Documents\\GitHub\\JAVA\\JavaUdemyBook\\LeituraArquivosBasica\\arq.txt";
		//Chamando a String do caminho do arquivo
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) { //Enquanto linha for diferente de nulo, significa que leu com sucesso
				System.out.println(line);
				line = br.readLine();
				}
		}catch ( IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		}

	}




	


