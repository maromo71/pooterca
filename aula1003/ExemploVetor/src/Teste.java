import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor pos: " + i + " valor: " + vetor[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dez valores inteiros");
        for (int i=0; i<vetor.length; i++){
            vetor[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Valores entrados");
        for(int x: vetor){ //for each - para cada
            System.out.printf("[%2d] ", x);
        }
        System.out.println();

        String nome = "Marcos Moraes";
        for(char x : nome.toCharArray()){
            System.out.printf("[%c ]", x);
        }
    }
}
