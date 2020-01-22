package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import entities.Employee;

public class Program {
public static void main(String[] args) {
	
	List<Employee> list = new ArrayList<>(); String path = "C:\\Users\\Dell\\Documents\\arq.txt";
	/* Crio o Try/Catch para efetuar a leitura do arquivo separado por virgulas */
	
	try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		
		String employeeCsv = br.readLine();/*Com essa variavel executa a leitura de uma linha do arquivo CSV */
		
		while (employeeCsv != null) { 
			/*Crio um vetor chamdo Fields que recebe as palavras da linha, utilizando a virgula como delimitador de espaço */
			String[] fields = employeeCsv.split(","); 
			
			/*Adiciono as posicoes do vetor como instancia para o construtor da classe empregado */
			list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); /*Como o Salario é um Wrapper Double, ele tem a funcao de transformar a String do salario em Double */
			
			employeeCsv = br.readLine(); /*Antes de acabar o While, eu leio a proxima linha como incremento para o Loop */ 
			} 
		
		Collections.sort(list); /*Utilizando a classe Employee que implementa a interface Comparable, eu consigo comparar o nome dos empregados e colocar em ordem alfabetica */
			
			for (Employee emp : list) { 
				
				System.out.println(emp.getName() + ", " + emp.getSalary()); 
				
			}
		
		
	}catch (IOException e) {
		
			System.out.println("Error: " + e.getMessage()); }
	
	} 
}


