package bytebankherdado;

public class SaldoInsuficienteException extends Exception{ //checked

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}