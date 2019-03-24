package course;

public class k {

	public static void main(String[] args) {
		/* Convertendo para Minuscula */
		String original = "RenanZito ABBADENHO É Analista SENIOR";
		String s01 = original.toLowerCase();
		
		System.out.println(s01);
		
		/* Convertendo para Maiuscula */
		String high = "   naruto fez um rasengan e entregou na mão de seu filho boruto  ";
		String high_c = high.toUpperCase();
		
		System.out.println(high_c);
		
		/* TRIM: Elimina os espaços presentes nas extremidades da String */
		String trimm = high.trim();
		
		System.out.println(trimm);
		
		/* Função Substring: delimitar a String original, dado os indices */
		String sub = trimm.substring(0, 10);
		System.out.println(sub);
		
		/* Função Replace = replace('caracter que deseja substituir','caracter que irá substituir' */
		String rep = original.replace('E', 'z');
		System.out.println(rep);
		
		/*Função replace com substring */
		String rep2 = original.replace("EN","HZ" );
		System.out.println(rep2);
		
		/*Achando posições das Strings e substrings*/
		int pos = trimm.indexOf("naruto");
		int posf = trimm.lastIndexOf("ruto");
		
		System.out.println("Aparição de naruto em "+pos+" Ultima aparição de ruto em "+posf);
		
		/*------------------------------------------*/
		
		/*Operação SPLIT - cria a String com um separador, e usa esse separador para abstrair as palavras entre esse mesmo separador */
		String s = "Potato Apple Lemon";
		String[] vect = s.split(" "); //Declaro vetor String[], dou o meu separador como " " (espaço)
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		
		
		
		

	}

}
