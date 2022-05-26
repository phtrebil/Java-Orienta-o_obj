package bytebankherdado;

public class testaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente G1 = new Gerente();
		G1.setNome("Geromel");
		G1.setCPF("324.453.543-09");
		G1.setSalario(7432.40);
		
        System.out.println(G1.getNome());
        System.out.println(G1.getCPF());
        System.out.println(G1.getSalario());

		
		G1.setSenha(1234);
		boolean autenticou = G1.autentica(1234);
		
		System.out.println(autenticou);
		System.out.println(G1.getBonificacao());

	}

}
