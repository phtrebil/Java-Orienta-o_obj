package bytebankherdado;

public class TesteSistema {

	public static void main(String[] args) {
		Client G = new Client();
		G.setSenha(2222);
		
		SistemaInterno SI = new SistemaInterno();
		SI.autentica(G);
		
	}

}
