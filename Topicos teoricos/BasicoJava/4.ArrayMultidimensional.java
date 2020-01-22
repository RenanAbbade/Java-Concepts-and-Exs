package tste;

import java.util.ArrayList;
import java.util.HashMap;


public class ArrayMultidimensional {

	public static void main(String[] args) {
		// Percorrendo um array multidimensional
		
		int notas[][] = new int [2][3];
		//2 linha, 3 colunas
		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 60;
		
		notas[1][0] = 80;
		notas[1][1] = 70;
		notas[1][2] = 60;
		
		//percorre linha
		for(int x = 0; x < notas.length; x++) {
		//percorre coluna
			for(int i = 0; i < notas[x].length;i++) {
				System.out.println(notas[x][i]);
			}
			
		}
		
		System.out.println(notas);

	}

}
