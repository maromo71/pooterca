public class Teste3 {
    static void main() {
        int[] vetor1 = {2,4,6,8,10,12,14,16,18,20};
        int[] vetor2 = new int[10];
        System.arraycopy(vetor1, 3, vetor2,7, 3 );
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor2[i]);
        }

    }
}
