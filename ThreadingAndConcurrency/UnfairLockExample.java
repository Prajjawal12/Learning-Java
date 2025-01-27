package ThreadingAndConcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {

  private final Lock lock = new ReentrantLock(true); // true makes it fair, can solve starvation

  public void doTasks() {
    lock.lock();
    try {
      System.out.println(Thread.currentThread().getName() + " acquired lock.");
      Thread.sleep(3000);
      System.out.println(Thread.currentThread().getName() + " has finished task!");
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      lock.unlock();
      System.out.println(Thread.currentThread().getName() + " has released the lock.");
    }
  }

  public static void main(String[] args) {
    UnfairLockExample ul = new UnfairLockExample();
    Runnable rl = new Runnable() {
      @Override
      public void run() {
        ul.doTasks();
      }
    };

    Thread t1 = new Thread(rl);
    Thread t2 = new Thread(rl);
    Thread t3 = new Thread(rl);
    try {
      t1.start();
      Thread.sleep(50);

      t2.start();
      Thread.sleep(50);

      t3.start();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // disdavantages of synchronized
    // 1.)Fairness
    // 2.)Blocking indefinite
    // 3.)Interruptibility
    // 4.)Read- Write locking
  }
}
