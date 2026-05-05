package model;

public abstract class Conta {
    protected int idConta;
    protected String cliente;
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public Conta(int idConta, String cliente){
        this.idConta = idConta;
        this.cliente = cliente;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            double valorTaxa = taxaSaque(valor);
            saldo -= valor + valorTaxa;
        }else{
            throw new IllegalArgumentException("Sem saldo para saque");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + idConta + "\n" +
                "Cliente: " + cliente + "\n" +
                "Saldo: R$ " + saldo + "\n";
    }

    abstract double taxaSaque(double valor);
}
