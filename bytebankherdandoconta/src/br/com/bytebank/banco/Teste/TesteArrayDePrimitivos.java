package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.*;

public class TesteArrayDePrimitivos {
	
	    public static void main(String[] args) {
	    	
	    	 Conta[] contas = new Conta[5];
	    	
	    	 ContaCorrente cc1 = new ContaCorrente(22, 11);
	         ContaPoupanša cc2 = new ContaPoupanša(22, 22);

	         contas[0] = cc1;
	         contas[1] = cc2;
	         
	         System.out.println(contas[1].getNumero());
	         ContaCorrente ref = (ContaCorrente) contas[0];
	         System.out.println(cc2.getNumero());
	         System.out.println(ref.getNumero());


	}
}
