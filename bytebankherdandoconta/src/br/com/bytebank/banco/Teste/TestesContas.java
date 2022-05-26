package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupan�a;
import br.com.bytebank.banco.Modelo.SaldoInsuficienteException;

public class TestesContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		// TODO Auto-generated method stub
		ContaCorrente CC = new ContaCorrente(123, 1234);
		CC.deposita(100);
		ContaPoupan�a CP = new ContaPoupan�a(987, 10987);
		CP.deposita(100);
		
		CC.transfere(10, CP);
		
		System.out.println(CC.getSaldo());
		System.out.println(CP.getSaldo());
		
	}

}
