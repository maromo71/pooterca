import java.util.ArrayList;
import java.util.List;

public class Teste1 {
    static void main() {
        int[] idades = {13, 21, 14, 33, 56};

        String[] nomes = {"Marcos", "Paulo", "Rita"};

        System.out.println("Nome: " + nomes[0]);
        System.out.println("Nome: " + nomes[2]);

        List<String> professores = new ArrayList<>();
        professores.add("Marcos");
        professores.add("Rita");
        professores.add("Paulo");

        List<String> alunos = List.of(
                "Maria",
                "Paula",
                "Joana"
        );
        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
