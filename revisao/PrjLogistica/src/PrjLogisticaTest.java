import java.util.Scanner;

import model.Caminhao;
import model.Rota;

public class PrjLogisticaTest {
    public static void main(String[] args) throws Exception {
        Rota rota1 = new Rota();
        rota1.setIdRota(1);
        rota1.setDestino("Curitiba");

        Scanner sc = new Scanner(System.in);
        int num = 2; // numero de caminhoes
        for (int i = 0; i < num; i++) {
            Caminhao caminhao = new Caminhao();
            System.out.println("Digite a placa do caminhao:  ");
            caminhao.setPlaca(sc.nextLine());
            System.out.println("Digite o Modelo do Caminhao: ");
            caminhao.setModelo(sc.nextLine());
            System.out.println("Digite a Capacidade de transporte: ");
            caminhao.setCapacidadeCarga(Integer.parseInt(sc.nextLine()));
            rota1.getCaminhaoList().add(caminhao);
        }
        System.out.println("Lista contem: " + 
            rota1.getCaminhaoList().size() + " caminhões");

        rota1.listarFrotaDaRota();
    }
}
