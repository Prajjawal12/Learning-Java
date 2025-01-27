package ThreadingAndConcurrency.ExecutorsFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Used when we want to perform some task at regular intervals
public class ScheduledExecutorServiceDemo {
  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    // scheduledExecutorService.schedule(() -> System.out.println("Printed after 5
    // second"), 5, TimeUnit.SECONDS);
    scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("Printed after every 5 seconds."), 5, 5,
        TimeUnit.SECONDS);

    scheduledExecutorService.scheduleWithFixedDelay(() -> System.out.println("Printed after every 5 seconds."), 5, 5,
        TimeUnit.SECONDS);

    scheduledExecutorService.schedule(() -> {
      System.out.println("Initiating Shutdown");
      scheduledExecutorService.shutdown();
    }, 20, TimeUnit.SECONDS);
  }
}
