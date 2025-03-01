package ThreadingAndConcurrency;

public class SynchronizationDemo {

  public static void main(String[] args) {
    Counter counter = new Counter(); // common resource

    MyThread t1 = new MyThread(counter);
    MyThread t2 = new MyThread(counter);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(counter.getCount());
  }
}
