class MyThread extends Thread {
    public MyThread (String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Created Thread 1");
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThreadFromRunnable implements  Runnable {
    @Override
    public void run() {
        System.out.println("Created Thread 2");
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadTest {
    public static void main(String[] args) {
//        System.out.println("ThreadTest");
//        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread("My Thread 1");
        Thread myThreadFromRunnable = new Thread(new MyThreadFromRunnable(), "My Thread 2");

        myThread.start();
        myThreadFromRunnable.start();

//        myThread.run();
//        myThreadFromRunnable.run();
    }
}
