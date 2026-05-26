package model;

public class Livro extends Produto {
    private String autor;

    public Livro(String descricao, double precoCusto, double precoVenda, int estoqueDisponivel, String autor) {
        super(descricao, precoCusto, precoVenda, estoqueDisponivel);
        this.autor = autor;
    }

    @Override
    public void calcularPrecoVenda() {
        this.setPrecoVenda(this.getPrecoCusto() * 1.15);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
