package concurrency;

import java.util.LinkedList;

public class Consumer {

    private LinkedList<String> list;

    public Consumer(LinkedList<String> list) {

        this.list = list;
    }

    public void consume() {

        new Thread(() -> {
            while (true) {
                try {
                    synchronized (list) {
                        System.out.println("Consumed: " + list.poll());
                        System.out.println("List content: " + list);
                    }
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // set Daemon
        }).start();
    }

}
