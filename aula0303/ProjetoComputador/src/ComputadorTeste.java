public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Pavilon";
        computador1.cor = "Preta";
        computador1.numeroSerie = 1234;
        computador1.preco = 5000;
        computador1.imprimir();
        computador1.calcularValor(); //alteracao do preco em 30%
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Velho";
        computador2.cor = "Preta";
        computador2.numeroSerie = 2345;
        computador2.preco = 1500;
        computador2.imprimir();
        computador2.calcularValor(); //Aumenta o preco em 50%
        computador2.imprimir();

        boolean alterou = computador2.alterarValor(2000.0);
        if(alterou){
            System.out.println("Alterado com sucesso!");
        }else{
            System.out.println("Valor invalido");
        }
        computador2.imprimir();
    }
}
