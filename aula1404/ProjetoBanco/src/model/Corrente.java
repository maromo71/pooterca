package model;

public class Corrente extends Conta {
    private double limiteEspecial;

    public Corrente(int idConta, String cliente, double limiteEspecial){
        super(idConta, cliente);
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= (limiteEspecial + saldo)){
            saldo -= valor;
        }else{
            throw new IllegalArgumentException("Sem saldo ou limite para o saque");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite do Especial: " + limiteEspecial;
    }
}
