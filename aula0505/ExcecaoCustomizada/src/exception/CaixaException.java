package exception;

/**
 * Classe de exceção personalizada para operações relacionadas ao caixa.
 * <p>
 * Essa exceção é lançada quando ocorre alguma violação de regra de negócio
 * nas operações de depósito ou saque.
 * </p>
 *
 * <p>
 * Cada erro é identificado por um código específico (errNumber), que é utilizado
 * para determinar a mensagem de erro apropriada.
 * </p>
 *
 * Exemplos de códigos:
 * <ul>
 *   <li>RF01EX01 - Valor inválido para depósito</li>
 *   <li>RF02EX01 - Saldo insuficiente para saque</li>
 * </ul>
 *
 * @author
 */
public class CaixaException extends Exception {

    /**
     * Código identificador do erro.
     */
    private String errNumber;

    /**
     * Construtor da exceção.
     *
     * @param errNumber Código do erro associado à exceção
     */
    public CaixaException(String errNumber){
        this.errNumber = errNumber;
    }

    /**
     * Retorna a mensagem de erro correspondente ao código informado.
     *
     * @return String contendo a descrição do erro
     */
    @Override
    public String getMessage() {
        String errMessage = "";
        if(errNumber.equals("RF01EX01")){
            errMessage = "Erro ao depositar. Valor inválido";
        }else if(errNumber.equals("RF02EX01")){
            errMessage = "Erro ao sacar. Valor do saldo insuficiente";
        }else{
            errMessage = "Erro desconhecido. Favor contactar Administrador";
        }
        return errMessage;
    }
}