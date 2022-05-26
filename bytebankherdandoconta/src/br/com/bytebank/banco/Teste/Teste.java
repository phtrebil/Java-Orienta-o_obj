package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupança;

public class Teste {
	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(11, 22);
		Object cp = new ContaPoupança(22, 33);
		
		System.out.println(cc);
		System.out.println(cp);
		
	
	}
}
