package transação;
//Classe de exception personalizada
public class DbException extends RuntimeException {
	//Número de versão padrão
	private static final long serialVersionUID = 1L;
	
	public DbException (String msg) {
		super(msg);//Informo uma mensagem pelo construtor transmitindo para a superclasse
	}

}
