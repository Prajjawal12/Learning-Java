package Exception_Handling.CustomExceptions;

public class ZeroBalanceException extends Exception {
    
    public ZeroBalanceException() {
        super("You have no amount in your bank account");
    }
}
