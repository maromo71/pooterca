package model;

public class Aluno {
    //Atributos privados (seguros)
    private int ra;
    private String nome;
    private String email;
    private String login;
    private String password;

    //Método construtor (padrão)
    public Aluno(){

    }
    //Segundo metodos construtor (1. overload (sobrecarga))
    public Aluno(int ra, String nome, String email){
        this.ra = ra;
        this.nome = nome;
        this.email = email;
    }
    //Terceiro metodo construtor (2. overload (sobrecarga))
    public Aluno(String login, String password){
        this.login = login;
        this.password = password;
        //logica que acessa o banco de dados e verifica
        //se as credencias de acesso estão corretas.
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Dados do model.Aluno\n");
        sb.append("ra=").append(ra).append('\n');
        sb.append("nome='").append(nome).append('\n');
        sb.append("email='").append(email).append('\n');
        sb.append("login='").append(login).append('\n');
        sb.append("password='").append(password).append('\n');
        return sb.toString();
    }
}
