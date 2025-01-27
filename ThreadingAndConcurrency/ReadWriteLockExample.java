package ThreadingAndConcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
  private int cnt = 0;

  private final ReadWriteLock lock = new ReentrantReadWriteLock();

  private final Lock readLock = lock.readLock();

  private final Lock writeLock = lock.writeLock();

  public void increment() {
    writeLock.lock();
    try {
      cnt++;
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      writeLock.unlock();
    }
  }

  public int getCount() {
    readLock.lock(); // multiple threads can require this only when the writelock is not acquired
    try {
      return cnt;
    } finally {
      readLock.unlock();
    }
  }

  public static void main(String[] args) {
    ReadWriteLockExample counter = new ReadWriteLockExample();

    Runnable readTask = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println(Thread.currentThread().getName() + " is performing the read operation on a task.");
          counter.increment();
        }
      }

    };

    Runnable writeTask = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println(Thread.currentThread().getName() + " is performing the write operation");
          counter.getCount();
        }
      }
    };

    Thread t1 = new Thread(readTask);
    Thread t2 = new Thread(writeTask);
    Thread t3 = new Thread(readTask);

    try {
      t1.start();
      t2.start();
      t3.start();

      t1.join();
      t2.join();
      t3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Final value of counter is: " + counter.getCount());

  }
}
