package ThreadingAndConcurrency;

public class ThreadAsLambda {
  public static void main(String[] args) {
    Runnable r = () -> System.out.println("The thread is running");
    Thread t1 = new Thread(r);
    t1.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

  }

}
