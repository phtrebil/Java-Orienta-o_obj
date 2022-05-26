package bytebankherdado;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica (Autenticavel A) {
		boolean autenticou = A.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("acesso permitido");
		}else {
			System.out.println("acesso negado");
		}
	}

}
