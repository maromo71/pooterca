public class Funcionario {
    //Atributos privados
    private String departamento;
    private double salario;
    private String rg;
    private String nome;
    private boolean ativo;

    //Gerar os gets e sets
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void bonificar(double valor){
        salario += valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do Funcionario \n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Departamento: ").append(departamento).append("\n");
        sb.append("Salário R$ ").append(salario).append("\n");
        sb.append("RG: ").append(rg).append("\n");
        if(ativo){
            sb.append("Funcionario Ativo na Empresa \n");
        }else{
            sb.append("Funcionario Inativado \n");
        }
        return sb.toString();
    }


}
