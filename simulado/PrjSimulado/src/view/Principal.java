package view;

import model.Dvd;
import model.Livro;
import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public List<Produto> produtosList = new ArrayList<>();

    static void main() {
        Principal gerenciarProdutos = new Principal();
        int opcao;
        do {
            opcao = construirMenu();
            switch (opcao) {
                case 1 -> gerenciarProdutos.execCadastrar();
                case 2 -> gerenciarProdutos.execConsultar();
                case 3 -> gerenciarProdutos.execEfetuarVenda();
                case 4 -> gerenciarProdutos.execEfetuarCompra();
                case 9 -> System.out.println("Fim do Programa");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 9);
    }

    private static int construirMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU PRINCIPAL - CONTROLE DE PRODUTOS");
        System.out.println("1. Cadastrar Novo Produto");
        System.out.println("2. Listar Todos os Produtos");
        System.out.println("3. Efetuar Venda (Simulacao)");
        System.out.println("4. Efetuar Compra (Simulacao)");
        System.out.println("9. Sair");
        System.out.println("Escolha sua opcao: ");
        return Integer.parseInt(sc.nextLine());
    }

    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        Produto produto;
        System.out.println("Cadastrando novo Produto");
        System.out.println("Escolha 1 para DVD, ou 2 para Livro ");
        int escolha = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.println("Digite o preco de custo: ");
        double precoCusto = Double.parseDouble(sc.nextLine());
        if (escolha == 1) {
            System.out.println("Digite o diretor do filme: ");
            String diretor = sc.nextLine();
            produto = new Dvd(descricao, precoCusto, 0, 0, diretor);
            ((Dvd)produto).calcularPrecoVenda(5.89);
        } else {
            System.out.println("Digite o autor do livro: ");
            String autor = sc.nextLine();
            produto = new Livro(descricao, precoCusto, 0, 0, autor);
            ((Livro)produto).calcularPrecoVenda();
        }
        produtosList.add(produto);
        System.out.println("Produto cadastrado com sucesso");
    }

    public void execConsultar() {
        System.out.println("Consulta todos os produtos");
        for (Produto p : produtosList) {
            System.out.println("Descricão: " + p.getDescricao());
            System.out.println("Preco Custo: " + p.getPrecoCusto());
            System.out.println("Preco Venda: " + p.getPrecoVenda());
            System.out.println("Estoque Disponível: " + p.getEstoqueDisponivel());
            if (p instanceof Dvd) {
                System.out.println("Diretor: " + ((Dvd) p).getDiretor());
            } else {
                System.out.println("Autor: " + ((Livro) p).getAutor());
            }
            System.out.println("-------------------------------------");
        }

    }

    public void execEfetuarVenda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Venda de Produtos");
        System.out.println("Descricao completa do produto: ");
        String descProcurada = sc.nextLine();
        for (Produto p : produtosList) {
            if (p.getDescricao().equalsIgnoreCase(descProcurada)) {
                try {
                    System.out.println("Digite a quantidade a ser vendida: ");
                    int qtdVenda = Integer.parseInt(sc.nextLine());
                    p.vender(qtdVenda);
                    System.out.println("Venda efetuada com sucesso");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void execEfetuarCompra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Compra de Produtos");
        System.out.println("Descricao completa do produto: ");
        String descProcurada = sc.nextLine();
        for (Produto p : produtosList) {
            if (p.getDescricao().equalsIgnoreCase(descProcurada)) {
                try {
                    System.out.println("Digite a quantidade a ser comprada: ");
                    int qtdCompra = Integer.parseInt(sc.nextLine());
                    p.comprar(qtdCompra);
                    System.out.println("Compra efetuada com sucesso");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
