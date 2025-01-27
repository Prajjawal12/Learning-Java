package ThreadingAndConcurrency;

//Deadlock condition
/*
 * 1.)Mutual Exclusion
 * 2.)Hold and Wait
 * 3.)No Pre emption
 * 4.)Cicular Wait
 */
public class DeadlockExample {

  private Object pen = new Object();
  private Object paper = new Object();

  /* Deadlock Resolution */
  // public void takePenThenPaper() throws InterruptedException {
  // synchronized (pen) {
  // System.out.println(Thread.currentThread().getName() + ": is taking the pen");
  // Thread.sleep(100); // Simulate work
  // synchronized (paper) {
  // System.out.println(Thread.currentThread().getName() + ": is taking the
  // paper");
  // }
  // }
  // }

  // public void takePaperThenPen() throws InterruptedException {
  // synchronized (pen) { // Always acquire pen first, even in this method
  // System.out.println(Thread.currentThread().getName() + ": is taking the
  // paper");
  // Thread.sleep(100); // Simulate work
  // synchronized (paper) {
  // System.out.println(Thread.currentThread().getName() + ": is taking the pen");
  // }
  // }
  // }

  public void takePen() throws InterruptedException {
    synchronized (pen) {
      System.out.println(Thread.currentThread().getName() + ": is taking the pen");
      System.out.println(Thread.currentThread().getName() + ": is attempting to take paper");
      takePaper();
    }

  }

  public void takePaper() throws InterruptedException {
    synchronized (paper) {
      System.out.println(Thread.currentThread().getName() + " is taking the paper");
      System.out.println(Thread.currentThread().getName() + " is attempting to take pen");
      takePen();
    }

  }

  public static void main(String[] args) throws InterruptedException {
    DeadlockExample dl = new DeadlockExample();
    Runnable pen = new Runnable() {
      @Override
      public void run() {
        try {
          dl.takePen();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Runnable paper = new Runnable() {
      @Override
      public void run() {
        try {
          dl.takePaper();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    Thread t1 = new Thread(pen, "Pen Thread");
    Thread t2 = new Thread(paper, "Paper Thread");

    t1.start();
    Thread.sleep(100);
    t2.start();

  }
}
