package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupan�a;

public class Teste {
	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(11, 22);
		Object cp = new ContaPoupan�a(22, 33);
		
		System.out.println(cc);
		System.out.println(cp);
		
	
	}
}
