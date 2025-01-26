// Method 1: Extending Thread class
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Thread 1, iteration " + i);
        }
    }
}

// Method 2: Implementing Runnable interface
class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Thread 2, iteration " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Method 1: Create and start a thread by extending the Thread class
        MyThread1 thread1 = new MyThread1();
        thread1.setName("Thread-1");
        thread1.start();
        // Method 2: Create and start a thread by implementing the Runnable interface
        MyThread2 runnable = new MyThread2();
        Thread thread2 = new Thread(runnable);
        thread2.setName("Thread-2");
        thread2.start();

        // Main thread (current thread)
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " – Main thread, iteration " + i);
        }
    }
}