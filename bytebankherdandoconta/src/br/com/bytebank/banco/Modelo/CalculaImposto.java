package br.com.bytebank.banco.Modelo;

public class CalculaImposto {
	
	private double TotalImposto;
	
	public void registra(Tributavel T) {
		
		double valor = T.getValorImposto();
		this.TotalImposto += valor;
		
	}
	
	public double getTotalImposto() {
		return TotalImposto;
	}
}
