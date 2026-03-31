package model;

public class Caminhao {
    private String placa;
    private String modelo;
    private int capacidadeCarga;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Dados do caminhão\n");
        sb.append("Placa: ").append(placa).append("\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        sb.append("Capacidade: ").append(capacidadeCarga);
        sb.append("=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-");
        return sb.toString();
    }
    
}
