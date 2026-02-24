import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        System.out.println("MENU");
        System.out.println("1. coca");
        System.out.println("2. fanta");
        System.out.println("3. guarana");
        System.out.println("Digite sua opcao");
        opcao = leitor.nextInt();
        switch(opcao){
            case 1 -> System.out.println("Escolheu coca-cola");
            case 2 -> System.out.println("Escolheu fanta");
            case 3 -> System.out.println("Escolheu guarana");
            default -> System.out.println("opcao invalida");
        }
    }
}
