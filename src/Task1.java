public class Task1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Thread1(), "Thread 1");
        thread1.start();
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {

        for (int i = 1; i <= 30; i++) {

            System.out.println(Thread.currentThread().getName() + ": " + i);
            if (i == 10) {

                Thread thread2 = new Thread(new Thread2(), "Thread 2");
                thread2.start();

                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                i = 20;
            }
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

