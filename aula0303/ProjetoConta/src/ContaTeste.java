import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta(); //Criar um objeto chamado cc

    public static void main(String[] args) {
        ContaTeste teste = new ContaTeste();
        Scanner sc = new Scanner(System.in);
        int opcao=0;
        do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Depositar na Conta");
            System.out.println("3. Sacar da Conta");
            System.out.println("4. Consultar dados");
            System.out.println("9. SAIR");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1 -> teste.execCadastrar();
                case 2 -> teste.execDepositar();
                case 3 -> teste.execSacar();
                case 4 -> teste.execConsultar();
                case 9 -> System.out.println("FIM");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao !=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da agencia: ");
        cc.agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        cc.conta = sc.nextLine();
        System.out.println("Conta cadastrada com sucesso ");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        double valorSaque;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        valorSaque = Double.parseDouble(sc.nextLine());
        boolean sacou = cc.sacar(valorSaque);
        if(sacou){
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Sem Saldo suficiente para o saque");
        }
    }
    public void execDepositar(){
        double valorDeposito;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        valorDeposito = Double.parseDouble(sc.nextLine());
        cc.depositar(valorDeposito);
        System.out.println("Deposito realizado com sucesso");
    }
}
