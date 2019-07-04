package deletarDados;

public class DbIntegrityException extends RuntimeException {
//Exceção personalizada de Integridade Referencial
	private static final long serialVersionUID = 1L;
	//ID padrão
	
	public  DbIntegrityException (String msg) {
		super(msg);
	}
	
	
	
	

}
