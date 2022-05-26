package br.com.bytebank.banco.Teste;

import br.com.bytebank.banco.Modelo.Conexao;

public class TestaConexao {
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao() ){
			conexao.leDados();
		}catch (IllegalStateException ex){
			 System.out.println("Fechando conexao");
		}
	}
}
