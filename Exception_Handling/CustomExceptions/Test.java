package Exception_Handling.CustomExceptions;

public class Test {
    
    public static void main(String[] args) throws ZeroBalanceException, InsufficientAmountException {
        BankAccount ba = new BankAccount(0);

        ba.withDrawAmount(30);
    }
}
