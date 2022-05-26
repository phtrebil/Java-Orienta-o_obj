package bytebankherdado;

public class testefuncionario {

	public static void main(String[] args) {
		
		funcionario Pedro = new Gerente();
		Pedro.setNome("Pedro Trebilcock");
		Pedro.setCPF("124.427.577-88");
		Pedro.setSalario(3700.56);
		
		System.out.println(Pedro.getNome());
		System.out.println(Pedro.getBonificacao());
		
	}
	
}
