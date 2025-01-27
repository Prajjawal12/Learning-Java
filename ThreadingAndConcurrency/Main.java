package ThreadingAndConcurrency;

public class Main {
    // Programs are executed within a CPU which is oftern referred as Brain of the
    // computer.

    // Core is an individual unit within a CPU where processing is done i.e
    // processing unit.
    // Modern day CPUs have multiple cores.

    // Program is a set of instructions
    // Process is an instance of a program in execution

    // Thread is the smallest unit of execution within a process.A process can have
    // multiple threads,which share
    // the same resources but run independently4

    // Multithreading refers to multiple threads of a process running simultaneously

    public static void main(String[] args) {

        CreateThread thread = new CreateThread();
        Thread t1 = new Thread(thread);
        t1.start();
        for (;;) {
            System.out.println(Thread.currentThread().getName());

            // Thread Lifecycle
            // THread has 5 states
            // New :- Thread created but not started
            // Runnable:- Ready for execution
            // RUnning- Thread is running ---> not in java
            // Blocked/Waiting:- Waiting for some work to happen
            // Terminated:- Thread has finished execution
        }
    }
}
