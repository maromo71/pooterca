package exception;

public class EstoqueInsuficienteException extends Exception{

    @Override
    public String getMessage() {
        return "Erro: Estoque insuficiente para essa transação";
    }
}
