package concurrency;

public class MyThread extends Thread {

    private String name;
    private int step;

    MyThread(String threadName, int step) {

        this.name = threadName;
        this.step = step;

        Thread t = new Thread(this, name);

        System.out.println("New thread: " + t);
        t.start();

        // JOIN
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10_000; i = i + step) {
            System.out.println(name + ": " + i);
        }

        long endTime = System.currentTimeMillis();
        long difference = endTime - startTime;
        System.out.println("Duration Thread " + Thread.currentThread().getName() + ": " + difference);
    }

}
