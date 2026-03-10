import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate dataNasc;
    private List<Carro> carros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void adicionarCarro(Carro carro){
        this.carros.add(carro);
    }
    public void removerCarroVendido(Carro carro){
        this.carros.remove(carro);
    }

    public void imprimirDadosDoCliente(){
        System.out.println(">>>> DADOS DO CLIENTE E SEUS CARROS <<<<");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Total de Carros: " + carros.size());
        for(Carro carro : carros){
            carro.imprimirCarro();
        }
        System.out.println(">>>>> ------------------------------ <<<<");
    }
}
