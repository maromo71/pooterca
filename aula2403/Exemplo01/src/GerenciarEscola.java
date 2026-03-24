import model.Aluno;
import model.Curso;
import model.Disciplina;

public class GerenciarEscola {
    static void main() {
        Aluno aluno1 = new Aluno(11, "Maria", "maria@gmail.com");
        Aluno aluno2 = new Aluno(12, "Jose", "jose@gmailil.com");
        Aluno aluno3 = new Aluno(13, "Pedro", "pedro@gmail.com");
        Disciplina disc1 = new Disciplina();
        disc1.setIdDisciplina(1);
        disc1.setNomeDisciplina("POO");
        disc1.setCargaHorariaDisciplina(80);
        Disciplina disc2 = new Disciplina();
        disc2.setIdDisciplina(2);
        disc2.setNomeDisciplina("Estrutura de Dados");
        disc2.setCargaHorariaDisciplina(80);
        Curso curso = new Curso();
        curso.setIdCurso(1);
        curso.setDescricao("ADS Análise e Desenvolvimento de Sistemas");
        curso.setCargaHoraria(2800);
        curso.setUnidade("Fatec Mogi Mirim");
        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);
        curso.adicionarDisciplina(disc1);
        curso.adicionarDisciplina(disc2);
        System.out.println(curso);

    }
}
