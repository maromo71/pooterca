import java.time.LocalDateTime;

public class Aluno {
    //1. Definir os atributos
    public int ra;
    public String nome;
    public String email;
    public String turma;

    //2. Definir os métodos
    public void matricular(){
        System.out.println("||| MATRICULANDO ALUNO |||");
        System.out.println("Aluno com RA: " + ra);
        System.out.println("foi matriculado com sucesso");
        System.out.println("---------------------------");
        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("||| =================== |||");
        System.out.println();
    }
    public void cancelarMatricula(){
        System.out.println("||| CANCELAR MATRICULA |||");
        System.out.println("Aluno com RA: " + ra);
        System.out.println("Sua matriculada foi cancelada");
        System.out.println("Dados do cancelamento");
        LocalDateTime momento = LocalDateTime.now();
        System.out.println("Data e Hora: " + momento);
        System.out.println("||| ================== |||");
    }
}
