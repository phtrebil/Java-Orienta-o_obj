package libs;

public class TesteString {
	public static void main(String[] args) {
		String nome = "Mario";
		String outro = new String("Mario");
		
		//String novo = outro.replace("a", "A");
		
		//String novo = nome.toUpperCase();

		//System.out.println(novo);
		
		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		} 
	    System.out.println(nome);
		
	}

}
