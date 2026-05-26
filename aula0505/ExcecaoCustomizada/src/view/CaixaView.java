package view;

import model.Caixa;
import java.util.Scanner;

/**
 * Classe responsável pela interação com o usuário (camada de visão).
 * <p>
 * Permite ao usuário executar operações no caixa através de um menu interativo
 * no console.
 * </p>
 *
 * Funcionalidades:
 * <ul>
 *   <li>Depositar valores</li>
 *   <li>Sacar valores</li>
 *   <li>Consultar saldo</li>
 * </ul>
 *
 * <p>
 * Utiliza tratamento genérico de exceções para exibir mensagens de erro ao usuário.
 * </p>
 *
 * @author
 */
public class CaixaView {

    /**
     * Instância da classe Caixa utilizada para operações.
     */
    private Caixa caixa;

    /**
     * Construtor que inicializa o sistema e executa o menu principal.
     */
    public CaixaView() {
        caixa = new Caixa();
        int opcao;
        do {
            opcao = construirMenu();
            switch (opcao) {
                case 1:
                    executarDeposito();
                    break;
                case 2:
                    executarSaque();
                    break;
                case 3:
                    executarConsulta();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    System.exit(0);
                default:
                    System.out.println("Opcao Invalida");
            }
        } while (opcao != 9);
    }

    /**
     * Exibe o saldo atual do caixa.
     */
    private void executarConsulta() {
        System.out.println("Saldo Atual R$ " + caixa.getSaldo());
    }

    /**
     * Executa a operação de saque com entrada do usuário.
     * <p>
     * Realiza a leitura do valor e trata possíveis exceções.
     * </p>
     */
    private void executarSaque() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor do saque: ");
            double valor = Double.parseDouble(sc.nextLine());
            caixa.sacar(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Executa a operação de depósito com entrada do usuário.
     * <p>
     * Realiza a leitura do valor e trata possíveis exceções.
     * </p>
     */
    private void executarDeposito() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor do deposito: ");
            double valor = Double.parseDouble(sc.nextLine());
            caixa.depositar(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Constrói e exibe o menu principal do sistema.
     *
     * @return opção escolhida pelo usuário ou -1 em caso de erro
     */
    private int construirMenu() {
        Scanner sc = new Scanner(System.in);
        try {
            int opc = 0;
            System.out.println("---- Menu Principal ----");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar ");
            System.out.println("3. Exibir Saldo");
            System.out.println("9. SAIR");
            opc = Integer.parseInt(sc.nextLine());
            return opc;
        } catch (Exception ex) {
            System.out.println("Erro na escolha de opcao");
            return -1;
        }
    }
}