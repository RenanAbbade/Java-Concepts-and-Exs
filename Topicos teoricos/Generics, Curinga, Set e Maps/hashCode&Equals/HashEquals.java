package hashCodeEquals;

public class HashEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Tanto HashCode quanto o Equals são operações da Classe Object
		 * utilizadas para comparar se um objeto é igual o outro
		 * Equals: lento, mas resposta 100%
		 * HashCode: Rápido, porém resposta positiva não é 100%
		 */
		String a = "Renan Abbade";
		String b = "Renan Abbade";
		System.out.println("EQUALS");
		System.out.println(a.equals(b)); //Compara o valor da variavel com equals
	    /* Hash Code é um método que retorna um número
	     * inteiro representando um código gerado a partir
	     * das informações do objeto
	     */
		System.out.println("HASH CODE");
		long hashA = a.hashCode();//Geralmente o número devolvido pela função HashCode pode ser muito longo 
		long hashB = b.hashCode();//sendo mais apropriado o tipo Long, porque se for INT valores diferentes podem ter o mesmo código por corte de Caracteres
		//Por ser muito rapido, é bastante utilizado quando devemos fazer comparações em um grande volume de dados
		System.out.println(a.equals(b));
		
		Cliente c1 = new Cliente("Renan Silva Abbade","renanabbade1997@gmail.com");
		Cliente c2 = new Cliente("Renan Silva Abbade","DimasOliver@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	

	}

}
