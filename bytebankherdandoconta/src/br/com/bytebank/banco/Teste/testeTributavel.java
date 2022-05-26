package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.CalculaImposto;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.SeguraDeVida;

public class testeTributavel {

	public static void main(String[] args) {
		
		ContaCorrente CC = new ContaCorrente(222, 1234);
		CC.deposita(2000);
		
		SeguraDeVida SV = new SeguraDeVida();
		
		CalculaImposto Calc = new CalculaImposto();
		
		Calc.registra(SV);
		Calc.registra(CC);
		
		System.out.println(Calc.getTotalImposto());

	}

}
