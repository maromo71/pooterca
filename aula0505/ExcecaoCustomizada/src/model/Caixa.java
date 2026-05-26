package model;

import exception.CaixaException;

/**
 * Classe que representa um caixa eletrônico simplificado.
 * <p>
 * Permite realizar operações básicas como depósito, saque e consulta de saldo.
 * As operações seguem regras de negócio específicas e podem lançar exceções
 * em caso de erro.
 * </p>
 *
 * Regras:
 * <ul>
 *   <li>Não é permitido depositar valores negativos</li>
 *   <li>Não é permitido sacar valores maiores que o saldo disponível</li>
 * </ul>
 *
 * @author
 */
public class Caixa {

    /**
     * Saldo atual do caixa.
     */
    private double saldo;

    /**
     * Realiza um depósito no caixa.
     *
     * @param valor Valor a ser depositado
     * @throws CaixaException Caso o valor seja negativo
     */
    public void depositar(double valor) throws CaixaException {
        if(valor < 0){
            throw new CaixaException("RF01EX01");
        }else{
            saldo += valor;
        }
    }

    /**
     * Realiza um saque no caixa.
     *
     * @param valor Valor a ser sacado
     * @throws CaixaException Caso o saldo seja insuficiente
     */
    public void sacar(double valor) throws CaixaException {
        if(valor > saldo){
            throw new CaixaException("RF02EX01");
        }else{
            saldo -= valor;
        }
    }

    /**
     * Retorna o saldo atual do caixa.
     *
     * @return saldo disponível
     */
    public double getSaldo(){
        return saldo;
    }
}