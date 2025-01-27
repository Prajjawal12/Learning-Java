package ThreadingAndConcurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

  private int balance = 100;
  private final Lock lock = new ReentrantLock();

  public BankAccount(int balance) {
    this.balance = balance;
  }

  public void withdraw(int amount) {
    System.out.println(Thread.currentThread().getName() + " attempting to perform a transaction");
    try {
      if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
        if (balance >= amount) {

          try {
            System.out.println(Thread.currentThread().getName() + " proceeding with transaction");
            Thread.sleep(10000);
            balance = balance - amount;
            System.out.println(
                Thread.currentThread().getName() + " performed transaction" + " and remaining balance is: " + balance);
          } catch (Exception e) {
            e.printStackTrace();
          } finally {
            lock.unlock();
          }
        } else {
          System.out.println("You have insufficient amount in you bank!");
        }
      } else {
        System.out.println(Thread.currentThread().getName() + " : Unable to acquire lock. ");
      }
    } catch (InterruptedException e) {
      // simply logging is not enough
      Thread.currentThread().interrupt();
    }

  }
}

// public synchronized void withdraw(int amount) throws InterruptedException {
// if (balance >= amount) {

// System.out.println(Thread.currentThread().getName() + " proceeding with
// transaction");
// Thread.sleep(10000);
// balance = balance - amount;
// System.out.println(
// Thread.currentThread().getName() + " performed transaction" + " and remaining
// balance is: " + balance);
// } else {
// System.out.println("You have insufficient amount in you bank!");
// }
// }