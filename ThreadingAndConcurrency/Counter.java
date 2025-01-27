package ThreadingAndConcurrency;

public class Counter {

  private int cnt = 0;

  public void increment() {
    synchronized (this) {
      cnt++;
    }
  }

  public int getCount() {
    return cnt;
  }
}
