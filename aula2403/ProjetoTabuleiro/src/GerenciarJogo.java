import model.Tabuleiro;

import java.util.Scanner;

public class GerenciarJogo {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int palpite1, palpite2;
        System.out.println("Digite seu primeiro palpite: ");
        palpite1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite seu segundo palpite: ");
        palpite2 = Integer.parseInt(sc.nextLine());
        //Invocar o Tabuleiro (instancia)
        Tabuleiro tabuleiro = new Tabuleiro();
        double premio = tabuleiro.jogar(palpite1, palpite2);
        if(premio > 0){
            System.out.println("Feliz Ganhador. Premio R$ " + premio);
        }else{
            System.out.println("Infelizmente nao foi dessa vez.");
        }
    }
}
