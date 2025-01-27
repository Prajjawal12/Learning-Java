package ThreadingAndConcurrency.ExecutorsFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
 * ExecutorService
 * .submit(r)
 * .submit(c)
 * .submit(r,t) ,  t comes when future.get() is called
 *  * .shutdown()
 * .shutdowNow()
 * .isShutDown()
 * .isTerminated() // all tasks have been completed after shutdown then true
 * .invokeAll() --> returns a list of all completed task
 * .invokeAny()  --> returns the task quickly completed
 */

public class ExecutorServiceMethods {
  public static void main(String[] args) {
    // ExecutorService executorService = Executors.newSingleThreadExecutor();

    // executorService.submit(() -> System.out.println("Hello Hello"));

    // executorService.shutdown();

    // System.out.println(executorService.isTerminated());

    ExecutorService executorService = Executors.newFixedThreadPool(1);

    Callable<Integer> callable1 = () -> 42;
    Callable<Integer> callable2 = () -> 21;
    Callable<Integer> callable3 = () -> 32;

    List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

    try {
      List<Future<Integer>> list2 = executorService.invokeAll(list, 1, TimeUnit.MICROSECONDS);
      for (var x : list2) {
        System.out.println(x.get());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (CancellationException e) {

    }

    executorService.shutdown();
  }
}
