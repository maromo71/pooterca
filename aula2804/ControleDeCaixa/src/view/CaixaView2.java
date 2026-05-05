package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

public class CaixaView2 {
    private JTextField textValor;
    private JTextField textSaldo;
    private JButton buttonEntrada;
    private JButton buttonConsulta;
    private JButton buttonRetirada;
    private JButton buttonSair;
    private JTextArea textMensagem;
    private JLabel labelValor;
    private JLabel labelSaldo;
    private JPanel panelCaixa;

    public JPanel getPanelCaixa() {
        return panelCaixa;
    }

    private Caixa caixa = new Caixa();
    public CaixaView2() {
        buttonEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(textValor.getText());
                caixa.depositar(valor);
                LocalDate data = LocalDate.now();
                String mensagem = "Deposito efetuado em " + data.toString() + "\n";
                textMensagem.append(mensagem);
                textValor.setText("");
                textValor.requestFocus();
            }
        });
        buttonRetirada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(textValor.getText());
                caixa.sacar(valor);
                LocalDate data = LocalDate.now();
                String mensagem = "Saque efetuado em " + data.toString() + "\n";
                textMensagem.append(mensagem);
                textValor.setText("");
                textValor.requestFocus();
            }
        });
        buttonConsulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double saldo = caixa.getSaldo();
                textSaldo.setText(Double.toString(saldo));
            }
        });
        buttonSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Saindo com cuidado!",
                        "Sair",
                        JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
            }
        });
    }
}
