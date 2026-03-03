public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Dados da conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
