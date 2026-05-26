import java.util.*;

public class Teste {
    static void main() {
        Pessoa p1 = new Pessoa(111, "Ana Silva");
        Pessoa p2 = new Pessoa(222, "Carlos Santos Silva");
        Pessoa p3 = new Pessoa(333, "Ada Silva");
        Pessoa p4 = new Pessoa(444, "Joao Antonio");
        Pessoa p5 = new Pessoa(444, "Joao Antonio");

        Set<Pessoa> conjunto = new HashSet<>();
        conjunto.add(p5);
        conjunto.add(p3);
        conjunto.add(p2);
        conjunto.add(p1);
        //Aqui temos colisao - p5 nao sera adicionado
        conjunto.add(p4);
        System.out.println("Tamanho do conjunto: " + conjunto.size());
        for(Pessoa p: conjunto){
            System.out.println(p);
        }

        List<Pessoa> lista = new ArrayList<>(conjunto);
        System.out.println("Tamanho da lista: " + lista.size());
        Collections.sort(lista);
        for(Pessoa p: lista){
            System.out.println(p);
        }
    }
}
