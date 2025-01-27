package ThreadingAndConcurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 *
 * CompletableFuture is a feature introduced in Java 8 that allows developers to
 * write asynchronous,
 * non-blocking code. It is part of the java.util.concurrent package and
 * provides methods for handling
 * asynchronous computations.
 *
 * Key Concepts:
 * - Asynchronous Computation: Tasks can run on separate threads without
 * blocking the main thread.
 * - Non-blocking API: CompletableFuture provides APIs to check task status or
 * to attach callbacks once tasks complete.
 * - Chaining and Combining: CompletableFuture allows chaining multiple tasks or
 * combining results of multiple futures.
 *
 */
public class CompletableFutureTut {

  public static void main(String[] args) {
    // EBasic CompletableFuture with supplyAsync
    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
      try {

        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "Task Completed";
    });

    // Block and get the result of the future )
    try {
      System.out.println("Result: " + future.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    // Attaching a callback using thenApply
    CompletableFuture<String> processedFuture = future.thenApply(result -> {

      return result + " - Processed";
    });

    try {
      System.out.println("Processed Result: " + processedFuture.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    // Running side-effects with thenAccept
    processedFuture.thenAccept(result -> {
      // Perform a side effect (e.g., logging) with the result
      System.out.println("Side-effect: Logging result -> " + result);
    });

    // Handling exceptions with exceptionally
    CompletableFuture<String> exceptionalFuture = CompletableFuture.supplyAsync(() -> {
      if (Math.random() > 0.5) {
        throw new RuntimeException("Simulated Exception");
      }
      return "Success";
    }).exceptionally(ex -> {

      System.out.println("Exception occurred: " + ex.getMessage());
      return "Fallback Result";
    });

    try {
      System.out.println("Exceptional Result: " + exceptionalFuture.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    // Combining multiple CompletableFutures
    CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
    CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

    CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
      return result1 + " " + result2;
    });

    try {
      System.out.println("Combined Result: " + combinedFuture.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    // Running multiple tasks and waiting for all to complete
    CompletableFuture<Void> allFutures = CompletableFuture.allOf(
        CompletableFuture.runAsync(() -> System.out.println("Task 1 Completed")),
        CompletableFuture.runAsync(() -> System.out.println("Task 2 Completed")),
        CompletableFuture.runAsync(() -> System.out.println("Task 3 Completed")));

    try {
      allFutures.get();
      System.out.println("All tasks completed.");
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    System.out.println("Main thread completed.");
  }
}
