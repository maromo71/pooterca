public class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private double valor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirCarro(){
        System.out.println("Dados do Carro: ");
        System.out.println("Modelo = " + modelo);
        System.out.println("Placa = " + placa);
        System.out.println("Ano = " + ano);
        System.out.println("Valor = " + valor);
    }
}
