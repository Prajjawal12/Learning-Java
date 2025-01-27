package ThreadingAndConcurrency;

public class SetDaemonDemo extends Thread {
  @Override
  public void run() {
    while (true) {
      System.out.println(Thread.currentThread().getName());
    }
  }

  // agar baki ke thread band ho gye hai, to mai(Thread 0) bhi band ho jata hu
  public static void main(String[] args) {
    SetDaemonDemo t1 = new SetDaemonDemo();
    t1.setDaemon(true);
    t1.start();
    SetDaemonDemo t2 = new SetDaemonDemo(); // User Thread
    t2.start();
    System.out.println("Main done!");
  }
}
