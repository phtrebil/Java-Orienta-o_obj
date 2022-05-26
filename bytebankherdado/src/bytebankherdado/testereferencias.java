package bytebankherdado;

public class testereferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente G2 = new Gerente();
		G2.setNome("Otatiano");
		G2.setSalario(5000);
		
		EditorVideo EV = new EditorVideo();
		EV.setSalario(2500);
		
		design D = new design();
		D.setSalario(2000);
		
		controleBonificacao CT = new controleBonificacao();
		CT.registra(D);
		CT.registra(EV);
		CT.registra(G2);
		
		System.out.println(CT.getSoma());
	}

}
