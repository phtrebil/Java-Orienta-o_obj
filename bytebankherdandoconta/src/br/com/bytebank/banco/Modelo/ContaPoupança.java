package br.com.bytebank.banco.Modelo;


public class ContaPoupan�a extends Conta {
	
	public ContaPoupan�a (int agencia, int numero){
	    super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	@Override
	public String toString() {
		return "Conta Poupan�a, " + super.toString();
	}

}
