package ThreadingAndConcurrency;

// Thread safety ensures that when multiple threads try to access a shared resource, no unexpected results will occur.
//notifyAll(): Wakes up all threads waiting on this object's monitor. This is typically used if multiple threads might depend on a condition change.

class SharedResource {
  private int data;
  private boolean hasData;

  public synchronized void produce(int value) {
    // If the shared resource already has data, the producer thread will wait until
    // it is consumed.
    while (hasData) {
      try {
        // The wait() method causes the current thread to release the lock and enter the
        // waiting state.
        // It will wait until another thread calls notify() or notifyAll() on this
        // object.
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    // Produces data and changes the state of the shared resource.
    data = value;
    hasData = true;

    // The notify() method wakes up a single thread that is waiting on this object's
    // monitor.
    // In this case, it will notify the consumer thread to proceed.
    notify();
    System.out.println("Produced: " + data);
  }

  public synchronized int consume() {
    // If no data is available, the consumer thread will wait until data is
    // produced.
    while (!hasData) {
      try {
        // The wait() method is used here to make the consumer thread wait until it is
        // notified by the producer.
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    // Consumes the data and changes the state of the shared resource.
    hasData = false;

    // The notify() method is called to wake up a single waiting producer thread.
    notify();
    System.out.println("Consumed: " + data);
    return data;
  }
}

class Producer implements Runnable {
  private SharedResource resource;

  public Producer(SharedResource resource) {
    this.resource = resource;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      resource.produce(i);
    }
  }
}

class Consumer implements Runnable {
  private SharedResource resource;

  public Consumer(SharedResource resource) {
    this.resource = resource;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      int data = resource.consume();
    }
  }
}

public class ThreadCommunicationTut {

  public static void main(String[] args) {
    SharedResource resource = new SharedResource();

    // Creating threads for producer and consumer.
    Thread t1 = new Thread(new Producer(resource));
    Thread t2 = new Thread(new Consumer(resource));

    // Starting both threads.
    t1.start();
    t2.start();
  }
}
