package model;

public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(int idConta, String cliente, double taxaJuros) {
        super(idConta, cliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Taxa de Juros: " + taxaJuros;
    }
}
