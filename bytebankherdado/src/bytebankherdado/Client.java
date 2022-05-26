package bytebankherdado;

public class Client implements Autenticavel {
	
	private AutenticaUtil autenticador;
	
	public Client() {
	
	this.autenticador = new AutenticaUtil();
	
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
}
	

}
