public class Teste2 {
    /**
     * Função Somar - Soma de dois valores inteiros
     * @param a primeiro valor a ser somado
     * @param b segundo valor a ser somado
     * @return resultado da soma em inteiros
     *
     */
    public static int somar(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        String valor = "121";
        //De inteiro para String
        int valorConvertido = Integer.parseInt(valor);
        int resultado = valorConvertido * 2;

        System.out.println("Resultado: " + resultado);

        //De string para inteiro
        String str_resultado = Integer.toString(resultado);
        int somado = somar(15, 20);
    }
}
