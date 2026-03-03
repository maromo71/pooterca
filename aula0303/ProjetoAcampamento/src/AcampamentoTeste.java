import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome da pessoa: ");
        membro.nome = sc.nextLine();
        System.out.println("Digite a idade desta pessoa: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
}
