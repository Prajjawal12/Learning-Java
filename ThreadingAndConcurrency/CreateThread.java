package ThreadingAndConcurrency;

// public class CreateThread extends Thread {
public class CreateThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
