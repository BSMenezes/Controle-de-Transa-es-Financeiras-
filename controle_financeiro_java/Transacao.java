
public class Transacao {
    private String descricao;
    private double valor;
    private String tipo; // "entrada" ou "saida"

    public Transacao(String descricao, double valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        return tipo.equalsIgnoreCase("entrada") ? valor : -valor;
    }

    public String toString() {
        return tipo.toUpperCase() + ": " + descricao + " - R$" + valor;
    }
}
