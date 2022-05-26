package bytebankherdado;

public class Gerente extends funcionario implements Autenticavel {


	private AutenticaUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
	public double getBonificacao() {
		return super.salario;
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
}
}
