package Exception_Handling.CustomExceptions;

public class BankAccount {
    
    private int balance;
    BankAccount(int balance) {
        this.balance = balance;
    }
    void withDrawAmount(int amount) throws ZeroBalanceException, InsufficientAmountException{
        if(balance == 0) {
            throw new ZeroBalanceException();
        }
        if(amount > balance) {
            throw new InsufficientAmountException();
        }
        System.out.println("Your remaining balance is: " + (balance-amount));
    }
}
