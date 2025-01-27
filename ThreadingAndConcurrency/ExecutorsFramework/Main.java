package ThreadingAndConcurrency.ExecutorsFramework;

//Thread pool refers to the collection of pre initialised threads to perform a task
//Resource Managerment :- we do not have to create and destroy threads again and again as assigning threads is also an overhead
//Faster response
//Control over thread count

//Executor Framework was introduced in Java 5, it is used in applications using concurreny,it abstracts the complexities involved in creating and managing threads

//Problems before Executor Framework
/*
 * Manual Thread Management
 * Resource Management
 * Scalability
 * Thread Reuse
 * Error Handling
 */

//Exectuors Framework has three core interfaces
/*
 * Executor
   ExecutorService
   ScheduledExecutorService
 */
public class Main {
  public static long factorial(int i) {
    int fact = 1;
    for (int k = 1; k <= i; k++) {
      fact = fact * k;
    }

    return fact;
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    Thread[] thread = new Thread[9];
    for (int i = 1; i < 10; i++) {
      int finalI = i;
      thread[i - 1] = new Thread(() -> {
        long res = factorial(finalI);
        System.out.println(res);
      });
      thread[i - 1].start();
    }

    for (Thread threads : thread) {
      try {
        threads.join();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
  }

}
