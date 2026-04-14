import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarBanco {

    private List<Conta> contas = new ArrayList<>();

    static void main() {
        Corrente corrente = new Corrente(111, "Maromo", 10000);
        Poupanca poupanca = new Poupanca(222, "Maromo", 10.50);

        corrente.depositar(1000);
        corrente.sacar(200);
        System.out.println(corrente);

        poupanca.depositar(5000);
        poupanca.sacar(200);
        System.out.println(poupanca);
        GerenciarBanco gb = new GerenciarBanco();
        gb.contas.add(corrente);
        gb.contas.add(poupanca);

        double totalNoBanco = 0;
        for (Conta c : gb.contas){
            totalNoBanco += c.getSaldo();
        }
        System.out.println("Total de depositos no Banco: " + totalNoBanco);

    }
}
