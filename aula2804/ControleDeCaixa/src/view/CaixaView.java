package view;

import model.Caixa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CaixaView extends JFrame implements ActionListener {
    private JLabel labelValor, labelSaldo;
    private JTextField textValor, textSaldo;
    private JButton buttonEntrada, buttonRetirada, buttonConsulta, buttonSair;
    private JTextArea textMensagem;
    private Dimension dLabel, dButton, dTextField, dTextArea, dFrame;
    private Caixa caixa;

    //Construtor
    public CaixaView(){
        //0. Definir os tamanhos padrão
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300, 140);
        //1. Definir a aparencia da janela
        this.setTitle("Controle de Caixa"); //Titulo da Janela
        this.setSize(dFrame); //tamanho da janela
        this.setResizable(false); //nao redimensionar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // [X] Fecha o programa
        this.setLayout(null); //nao vai usar gerenciador de layout
        this.setLocationRelativeTo(null); //sem posicao relativa - ficar no centro
        //2. Definir cada componente que vai na janela
        labelValor = new JLabel("Valor: ");
        labelValor.setSize(dLabel);
        labelValor.setLocation(25, 50);
        this.add(labelValor);

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
        textSaldo.setLocation(75,80);
        this.add(textSaldo);

        buttonEntrada = new JButton("Entrada");
        buttonEntrada.setSize(dButton);
        buttonEntrada.setLocation(25,150);
        this.add(buttonEntrada);

        buttonRetirada = new JButton("Retirada");
        buttonRetirada.setSize(dButton);
        buttonRetirada.setLocation(225,150);
        this.add(buttonRetirada);

        buttonConsulta = new JButton("Consulta");
        buttonConsulta.setSize(dButton);
        buttonConsulta.setLocation(25,185);
        this.add(buttonConsulta);

        buttonSair = new JButton("Sair");
        buttonSair.setSize(dButton);
        buttonSair.setLocation(225, 185);
        this.add(buttonSair);

        textMensagem = new JTextArea("");
        textMensagem.setSize(dTextArea);
        textMensagem.setLocation(25,210);
        this.add(textMensagem);
        //3. Adicionar ouvintes para os objetos desejados
        buttonSair.addActionListener(this);
        buttonConsulta.addActionListener(this);
        buttonRetirada.addActionListener(this);
        buttonEntrada.addActionListener(this);
        //4. Criar o objeto do tipo Caixa
        caixa = new Caixa();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonSair){
            JOptionPane.showMessageDialog(
                    null,
                    "Saindo com cuidado!",
                    "Sair",
                    JOptionPane.INFORMATION_MESSAGE
            );
            System.exit(0);
        }
        if(e.getSource()==buttonConsulta){
            double saldo = caixa.getSaldo();
            textSaldo.setText(Double.toString(saldo));
        }
        if(e.getSource()==buttonEntrada){
            try{
                double valor = Double.parseDouble(textValor.getText());
                caixa.depositar(valor);
                LocalDate data = LocalDate.now();
                String mensagem = "Deposito efetuado em " + data.toString() + "\n";
                textMensagem.append(mensagem);
                textValor.setText("");
                textValor.requestFocus();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(
                        null,
                        ex.getMessage(),
                        "Erro ao depositar: ",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
        if(e.getSource()==buttonRetirada){
           try{
               double valor = Double.parseDouble(textValor.getText());
               caixa.sacar(valor);
               LocalDate data = LocalDate.now();
               String mensagem = "Saque efetuado em " + data.toString() + "\n";
               textMensagem.append(mensagem);
               textValor.setText("");
               textValor.requestFocus();
           }catch (Exception ex){
               JOptionPane.showMessageDialog(
                       null,
                       ex.getMessage(),
                       "Erro ao sacar: ",
                       JOptionPane.ERROR_MESSAGE
               );
           }
        }
    }
}
