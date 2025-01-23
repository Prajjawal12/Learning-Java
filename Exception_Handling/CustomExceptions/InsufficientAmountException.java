package Exception_Handling.CustomExceptions;

public class InsufficientAmountException extends Exception {
    
    public InsufficientAmountException() {
        super("Amount is insufficient to process");

    }

}
