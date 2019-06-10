package concurrency;

import java.util.List;
import java.util.Random;

public class Producer {

    private List<String> list;

    public Producer(List<String> list) {
        this.list = list;
    }

    public void produce() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (list) {
                    String payload = "P" + i;
                    list.add(payload);
                    System.out.println("Produced: " + payload);
                    System.out.println("List content: " + list);
                    // notify ?
                }
                try {
                    Thread.sleep(500 + new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
