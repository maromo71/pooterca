package model;

import exception.EstoqueInsuficienteException;

public abstract class Produto {
    private String descricao;
    private double precoCusto;
    private double precoVenda;
    private int estoqueDisponivel;

    abstract void calcularPrecoVenda();

    public Produto(String descricao, double precoCusto, double precoVenda, int estoqueDisponivel){
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public void vender(int qtd) throws EstoqueInsuficienteException {
        if(qtd > this.estoqueDisponivel){
            throw new EstoqueInsuficienteException();
        }
        this.estoqueDisponivel -= qtd;
    }

    public void comprar(int qtd){
        this.estoqueDisponivel += qtd;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }
}
