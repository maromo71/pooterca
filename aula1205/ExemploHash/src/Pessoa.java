import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private int idPessoa;
    private String nome;

    public Pessoa(int idPessoa, String nome){
        this.idPessoa = idPessoa;
        this.nome = nome;
    }
    public Pessoa(){

    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id da Pessoa: " + idPessoa + "\n" +
                "Nome da Pessoa: " + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pessoa pessoa)) return false;
        return idPessoa == pessoa.idPessoa;
    }

    @Override
    public int hashCode() {
        //Analogia das caixas (meu metodo hashing)
        return nome.length();
    }

    @Override
    public int compareTo(Pessoa o) {
        if(this.idPessoa < o.idPessoa) return -1;
        if(this.idPessoa > o.idPessoa) return  1;
        return 0;
    }
}
