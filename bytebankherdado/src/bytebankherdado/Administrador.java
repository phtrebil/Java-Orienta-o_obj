package bytebankherdado;

public class Administrador extends funcionario implements Autenticavel{
	
	private AutenticaUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticaUtil();		
	}
	

	@Override
	public double getBonificacao() {
		return super.salario;
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
