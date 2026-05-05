public class Teste6 {
    private String nome;
    private int idade;

    void alterar(Teste6 obj){
        obj.nome = "Maria";
        obj.idade = 60;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    static void main() {
        Teste6 obj = new Teste6();
        obj.nome = "Oscar";
        obj.idade = 44;
        obj.alterar(obj);
        System.out.println("Nome: " + obj.nome);
        System.out.println("Idade: " + obj.idade);
    }
}
