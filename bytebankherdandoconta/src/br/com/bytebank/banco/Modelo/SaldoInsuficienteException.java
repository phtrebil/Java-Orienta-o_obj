package br.com.bytebank.banco.Modelo;



public class SaldoInsuficienteException extends Exception{ //checked

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}