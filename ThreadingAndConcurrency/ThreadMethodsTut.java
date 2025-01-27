package ThreadingAndConcurrency;

// start run join setPriority interrupt yield setDaemon
//daemon threads work in background other than user threads
//jvm will not wait for daemon threads
public class ThreadMethodsTut extends Thread {

  public ThreadMethodsTut(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority());
      Thread.yield();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    ThreadMethodsTut t1 = new ThreadMethodsTut("Example");
    ThreadMethodsTut t2 = new ThreadMethodsTut("Example2");
    ThreadMethodsTut t3 = new ThreadMethodsTut("Example3");
    t1.start(); // run method is called
    t1.interrupt();
    t2.start();
    t3.start();
    t1.setPriority(MIN_PRIORITY);
    t2.setPriority(MAX_PRIORITY);
    t3.setPriority(NORM_PRIORITY);
    try {
      t1.join();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
