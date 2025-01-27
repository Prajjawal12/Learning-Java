package ThreadingAndConcurrency.ExecutorsFramework;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Future methods
 .get()
 .isDone()
 .isCancelled()
 ,get(time)
 .cancel()
 .isCancelled()
 */
public class FutureUse {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    Future<?> future = executorService.submit(() -> {
      try {
        Thread.sleep(3000);
        System.out.println("Performing a task");
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    });
    Thread.sleep(1000);
    future.cancel(false);
    System.out.println(future.isCancelled());
    System.out.println(future.isDone());
    // try {
    // System.out.println(future.get());

    // } catch (ExecutionException e) {
    // e.printStackTrace();
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // if (future.isDone()) {
    // System.out.println("Task is done");

    // }

    executorService.shutdown();

  }
}
