import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Teste {
    static void main() {
        List lista = new LinkedList();
        long inicio = System.currentTimeMillis();
        //Algoritmo para inserir 2.600.000 itens na lista
        for(int i=0; i<2600000; i++){
            lista.add(i);
        }
        long fim  = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo para inserir: " + tempo + " segundos");
        inicio = System.currentTimeMillis();
        //Algoritmo para varrer (iterar) sobre o 2.600.000 itens da lista
        for(Object item: lista) {
            int x = (int)item;
        }
        fim = System.currentTimeMillis();
        tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo para iterar: "+ tempo + " segundos");

    }
}
