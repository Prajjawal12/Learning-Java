package ThreadingAndConcurrency;

public class MyThread extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.increment();
    }

  }

  private Counter counter;

  public MyThread(Counter counter) {
    this.counter = counter;
  }
}
