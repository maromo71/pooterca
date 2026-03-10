import java.time.LocalDate;

public class GerenciarEstacionamento {
    //A ideia é criar dois clientes novos
    //Cada cliente com ao menos um carro.
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Carlos Santos");
        cliente1.setEndereco("Rua Tal, 12");
        cliente1.setTelefone("99-9999-9999");
        cliente1.setDataNasc(LocalDate.of(1985, 12, 01));

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria Goncalves");
        cliente2.setEndereco("Rua XV, 13");
        cliente2.setTelefone("88-8888-8888");
        cliente2.setDataNasc(LocalDate.of(2001, 1, 30));

        Carro carro1 = new Carro();
        carro1.setModelo("Uno");
        carro1.setAno(1999);
        carro1.setPlaca("XXX-9999");
        carro1.setValor(5000.0);

        Carro carro2 = new Carro();
        carro2.setModelo("Fusca");
        carro2.setAno(1968);
        carro2.setPlaca("DDD-8989");
        carro2.setValor(50000.0);

        Carro carro3 = new Carro();
        carro3.setModelo("King");
        carro3.setAno(2026);
        carro3.setPlaca("XXX-0909");
        carro3.setValor(189000.0);

        //Estabelecer as associacoes entre veiculos e seus donos
        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);
        cliente2.adicionarCarro(carro3);

        //Imprimir os dados do cliente1.
        System.out.println(); //pular linha
        cliente1.imprimirDadosDoCliente();

        //Imprimir os dados do cliente2.
        System.out.println(); // pular uma linha
        cliente2.imprimirDadosDoCliente();

        //Agora removendo o segundo carro do cliente 1 (fusca)
        System.out.println();
        cliente1.removerCarroVendido(carro2);
        cliente1.imprimirDadosDoCliente();

    }

}
