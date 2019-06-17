package Leitura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedWriter é mais rapido
		String[] lines = new String[] {"Renan", "Itau","São Paulo"};
		
		String path = "C:\\Users\\Dell\\Documents\\arq.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			//Para cada String Line contido em Lines, vou escreve essa linha
			for (String line : lines) {
				bw.write(line);
				bw.newLine();//quebra de linha
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
