import java.util.ArrayList;
import java.util.List;

public class Teste {
    static void main() {
        List lista = new ArrayList();
        //add adiciona sequencialmente na lista
        lista.add("Comida");
        lista.add(12);
        lista.add(System.currentTimeMillis());
        lista.add(23.89);
        lista.add("Comida");
        lista.add("Comida");
        //tamanho método size()
        System.out.println(lista.size() + " elementos");

        //Iterar pela lista
        for(Object o : lista){
            System.out.println(o);
        }
        String proc = "Comida";
        //saber se o 12 ou o proc esta na lista
        if(lista.contains(proc)) System.out.println("Esta na lista");
        while(lista.contains("Comida")) lista.remove("Comida");

        System.out.println("Total na lista agora: " + lista.size());
        for(Object o : lista){
            System.out.println(o);
        }

    }
}
