package ThreadingAndConcurrency.ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
  public static long factorial(int i) {
    long fact = 1;
    for (int k = 1; k <= i; k++) {
      fact = fact * k;
    }
    return fact;
  }

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 10; i++) {
      final int finalI = i;
      Future<?> future = executorService.submit(() -> {
        long res = factorial(finalI);
        System.out.println("Factorial of i: " + res);
        return res;
      });
    }
    executorService.shutdown();
    try {
      while (!executorService.awaitTermination(1, TimeUnit.MILLISECONDS)) {
        System.out.println("Waiting");
      }
    } catch (InterruptedException e) {

      e.printStackTrace();
    }
    System.out.println("check");
  }
}
