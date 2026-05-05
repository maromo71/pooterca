package model;

public class Caixa {
    private double saldo;

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }else{
            throw new IllegalArgumentException("Sem saldo para saque!");
        }
    }
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }else{
            throw new IllegalArgumentException("Valor inválido para depósito.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
