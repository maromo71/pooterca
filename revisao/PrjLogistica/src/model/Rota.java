package model;

import java.util.ArrayList;
import java.util.List;

public class Rota {
    private int idRota;
    private String destino;
    private List<Caminhao>caminhaoList =new ArrayList<>();
    
    public int getIdRota() {
        return idRota;
    }
    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public List<Caminhao> getCaminhaoList() {
        return caminhaoList;
    }
    public void setCaminhaoList(List<Caminhao> caminhaoList) {
        this.caminhaoList = caminhaoList;
    }

    public void listarFrotaDaRota(){
        System.out.println("Na rota n. " + idRota);
        System.out.println("Para: " + destino);
        System.out.println("PArtem os seguintes caminhões: ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for(Caminhao caminhao : caminhaoList){
            System.out.println(caminhao);
        }
    }

    
}
