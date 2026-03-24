package model;

import java.util.Random;

public class Tabuleiro {
    //Atributos
    private int matriz[][] = new int[10][10];
    private int palpites[] = new int[2];

    //Metodo Construtor
    public Tabuleiro(){
        //logica de montar o tabuleiro
        Random aleatorio  = new Random();
        //percorre a matriz para preencher com valores 1..100
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = aleatorio.nextInt(1, 101);
            }
        }
    }
    //Método jogar, receber dois palpites e invocar o metodo verificarAcertos
    public double jogar(int p1, int p2){
        palpites[0] = p1;
        palpites[1] = p2;
        int acertos = verificarAcertos();
        mostrarTabuleiro();
        if(acertos >= 3){
            return 1000.0 * acertos;
        }else{
            return 0.0;
        }
    }

    private void mostrarTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10; j++) {
                if(matriz[i][j] == palpites[0] || matriz[i][j] == palpites[1]){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    private int verificarAcertos() {
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(matriz[i][j] == palpites[0] || matriz[i][j]== palpites[1]){
                    cont++;
                }
            }
        }
        return cont;
    }


}
