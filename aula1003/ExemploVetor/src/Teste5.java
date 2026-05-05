public class Teste5 {
    //Exemplo de passagem por valor (passo uma copia do valor
    //para a variavel)
    int somar(int a, int b){
        a = a - 7;
        return a + b;
    }

    static void main() {
        Teste5 teste = new Teste5();
        int a = 10;
        int b = 10;
        int resultado = teste.somar(a, b);
        System.out.println("Resultado: " + resultado);
        System.out.println("Valor de a, atualmente: " + a);
    }
}
