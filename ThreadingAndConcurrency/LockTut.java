package ThreadingAndConcurrency;

public class LockTut {
  public static void main(String[] args) {
    // Locks are of two types
    // 1.)Intrinsic:- every java has an intrisic lock given, it is utilised when we
    // use the synchronized keyword and automatic locking and unlcking done here
    // 2.)Extrinsic:- it can be invoked using Lock class
    // java.util.concurrent.locks,we explicitly define the locking and unlocking
    BankAccount bankAccount = new BankAccount(1000);
    Runnable newRunnable = new Runnable() {
      @Override
      public void run() {

        bankAccount.withdraw(20);

      }
    };
    Thread t1 = new Thread(newRunnable, "Transaction1");
    Thread t2 = new Thread(newRunnable, "Transaction2");
    t1.start();
    t2.start();

  }
}
