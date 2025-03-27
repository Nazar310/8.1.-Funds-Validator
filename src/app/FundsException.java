package app;

// повідомлення про недостачу коштів
public class FundsException extends Exception {
    public FundsException(String message) {
        super(message);
    }
}