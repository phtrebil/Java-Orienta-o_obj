package br.com.bytebank.banco.Modelo;


public class ContaPoupanša extends Conta {
	
	public ContaPoupanša (int agencia, int numero){
	    super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	@Override
	public String toString() {
		return "Conta Poupanša, " + super.toString();
	}

}
