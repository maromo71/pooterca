import java.text.spi.BreakIteratorProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    static void main() {
        Scanner sc = new Scanner(System.in);
        GerenciarFuncionario gerenciar = new GerenciarFuncionario();
        int opcao;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Bonificar Funcionario");
            System.out.println("3. Consultar Funcionario");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> gerenciar.execCadastrar();
                case 2 -> gerenciar.execBonificar();
                case 3 -> gerenciar.execConsultar();
                case 9 -> System.out.println("Fim do Programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }

    public void execConsultar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionario a ser consultado: ");
        String rgProc = sc.nextLine();
        //comando foreach (para cada)
        for(Funcionario funcionario : listaFuncionarios){
            if(funcionario.getRg().equals(rgProc)){
                System.out.println(funcionario);
                return;
            }
        }
    }
    public void execBonificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionario a ser bonificado: ");
        String rgProc = sc.nextLine();
        //comando foreach (para cada)
        for(Funcionario funcionario : listaFuncionarios){
            if(funcionario.getRg().equals(rgProc)){
                //Bonificar o cara encontrado
                System.out.println("Digite o valor da bonificação: ");
                double aumento = Double.parseDouble(sc.nextLine());
                funcionario.bonificar(aumento); //bonificar
                System.out.println("Funcionario Bonificado");
                return;
            }
        }
        System.out.println("RG de funcionario nao encontrado");
    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        func.setNome(sc.nextLine());
        System.out.println("Digite o rg do funcionario: ");
        func.setRg(sc.nextLine());
        System.out.println("Digite o departamento do funcionario: ");
        func.setDepartamento(sc.nextLine());
        System.out.println("Digite o salario do funcionario: ");
        func.setSalario(Double.parseDouble(sc.nextLine()));
        func.setAtivo(true);
        System.out.println("Funcionario cadastrado com sucesso...");
        listaFuncionarios.add(func); //adicionar funcionario na lista

    }
}
