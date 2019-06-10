package concurrency;

public class MyRunnable implements Runnable {

    private Thread t;
    private String name;

    MyRunnable(String threadName) {

        this.name = threadName;

        t = new Thread(this, name);

        System.out.println("New thread: " + t);
        t.start();
    }

    public static synchronized void test2() {

    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i%10 == 0) {
                System.out.println("String");
            }
        }

        long endTime = System.currentTimeMillis();
        long difference = endTime - startTime;
        System.out.println("Duration Thread " + Thread.currentThread().getName() + ": " + difference);
    }

}
