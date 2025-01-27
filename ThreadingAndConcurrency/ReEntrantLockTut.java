package ThreadingAndConcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//For the same thread, reentrant lock allows us to acquire the lock again,internally what happens is that a count for locks is kept tracked of,so once the inner method releases the lock doesnt mean another thread can start method,for that even the outer method will have to release the lock.
public class ReEntrantLockTut {
  private final Lock lock = new ReentrantLock();

  public void innerMethod() {
    lock.lock();
    try {
      System.out.println("Inner Method");
    } finally {
      lock.unlock();
    }
  }

  public void outerMethod() {
    lock.lock();
    try {
      System.out.println("Outer Method");
      innerMethod();
    } finally {
      lock.unlock();
    }
  }

  public static void main(String[] args) {
    ReEntrantLockTut re = new ReEntrantLockTut();

    re.outerMethod();
  }
}
