package view;
import model.Caixa;

import javax.swing.*;
import java.awt.*;

//Nossa tela
public class CaixaView extends JFrame {
    private JLabel labelSaldo, labelValor;
    private JTextField textSaldo, textValor;
    private JButton buttonEntrada, buttonRetirada, buttonConsulta, buttonSair;
    private JTextArea textMensagem;
    private Dimension dLabel, dTextField, dButton, dTextArea, dFrame;
    private Caixa caixa;

    public CaixaView(){
        definirTamanhos(); //invocar funcao para definir os tamanhos padroes
        adicionarComponentes(); //adicionar todos os elementos na janela
    }

    private void adicionarComponentes() {
        labelValor = new JLabel("Valor: "); //texto
        labelValor.setSize(dLabel); //tamanho
        labelValor.setLocation(25, 50); //posicionamento
        this.add(labelValor); //adicionar na janela

        labelSaldo = new JLabel("Saldo: ");
        labelSaldo.setSize(dLabel);
        labelSaldo.setLocation(25, 80);
        this.add(labelSaldo);

        textValor = new JTextField("");
        textValor.setSize(dTextField);
        textValor.setLocation(75,50);
        this.add(textValor);

        textSaldo = new JTextField("");
        textSaldo.setSize(dTextField);
        textSaldo.setLocation(75, 80);
        this.add(textSaldo);

        buttonEntrada = new JButton("Entrada");
        buttonEntrada.setSize(dButton);
        buttonEntrada.setLocation(25,150);
        this.add(buttonEntrada);

        buttonRetirada = new JButton("Retirada");
        buttonRetirada.setSize(dButton);
        buttonRetirada.setLocation(225,150);
        this.add(buttonRetirada);

        buttonConsulta = new JButton("Consultar");
        buttonConsulta.setSize(dButton);
        buttonConsulta.setLocation(25,185);
        this.add(buttonConsulta);

        buttonSair = new JButton("Sair");
        buttonSair.setSize(dButton);
        buttonSair.setLocation(225,185);
        this.add(buttonSair);

        textMensagem = new JTextArea("");
        textMensagem.setSize(dTextArea);
        textMensagem.setLocation(25,220);
        this.add(textMensagem);
    }

    private void definirTamanhos() {
        dFrame = new Dimension(367,420);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //definir as propriedades da janela
        this.setSize(dFrame); //tamanho da janela
        this.setTitle("Controle de Caixa"); //titulo da janela
        this.setResizable(false); //nao redimensional
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //fechar ao sair (x)
        this.setLayout(null); //sem definir layout. Nos cuidares.
        this.setLocationRelativeTo(null); //centralizar a janela
    }
}
