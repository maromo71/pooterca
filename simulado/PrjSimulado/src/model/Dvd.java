package model;

public class Dvd extends Produto{
    private String diretor;

    public Dvd(String descricao, double precoCusto, double precoVenda, int estoqueDisponivel, String diretor) {
        super(descricao, precoCusto, precoVenda, estoqueDisponivel);
        this.diretor = diretor;
    }


    public void calcularPrecoVenda(double cotacao) {
        this.setPrecoVenda(this.getPrecoCusto() * cotacao);
    }

    @Override
    public void calcularPrecoVenda() {
        System.out.println("Necessário informar cotacao");
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
