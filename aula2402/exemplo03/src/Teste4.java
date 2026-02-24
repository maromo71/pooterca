import java.util.Scanner;

public class Teste4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo valor: ");
        int b = Integer.parseInt(sc.nextLine());

        int mult = a * b;
        System.out.println("Resultado da multiplicacao: " + mult);
    }
}
