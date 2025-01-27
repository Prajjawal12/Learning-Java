package ThreadingAndConcurrency;

public class ThreadStates extends Thread {

  @Override
  public void run() {
    System.out.println("RUNNING");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ThreadStates t1 = new ThreadStates();
    System.out.println(t1.getState());
    t1.start();
    System.out.println(t1.getState());
    Thread.sleep(100);
    System.out.println(t1.getState());
    t1.join();
    System.out.println(t1.getState());

  }
}
