import java.util.Arrays;

public class Teste2 {
    static void main() {
        int[] valores = {34, 1, 11, 56, 12, 67, 3, 99};
        //ordenar este vetor inloco
        Arrays.sort(valores);
        for(int x: valores) System.out.println(x);

        String[] nomes = {"Jose", "Antonio", "Zeca", "Ana"};
        Arrays.sort(nomes);
        for(String nome : nomes) System.out.println(nome);
    }
}
