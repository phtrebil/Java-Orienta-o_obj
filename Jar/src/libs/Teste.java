package libs;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class Teste {

    public static void main(String[] args) {
        Conta c = new ContaCorrente(123, 321);
        c.deposita(200);
        System.out.println(c.getSaldo());
    }
}