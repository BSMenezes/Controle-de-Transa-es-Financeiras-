
import java.util.ArrayList;

public class Carteira {
    private ArrayList<Transacao> transacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao t) {
        transacoes.add(t);
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            saldo += t.getValor();
        }
        return saldo;
    }

    public void listarTransacoes() {
        for (Transacao t : transacoes) {
            System.out.println(t);
        }
    }
}
