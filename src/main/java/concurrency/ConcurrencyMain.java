package concurrency;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class ConcurrencyMain {

    public static void main(String... args) throws InterruptedException {

  //      MyThread myThread = new MyThread();
 //      myThread.start();

  //      MyRunnable myRunnable = new MyRunnable();
   //     Thread thread = new Thread(myRunnable);
  //     thread.start();

        sequentialVsParallelStreams();
   //     exercise1();
  //     exercise2();
 //      singletonEx();
  //     joinExample();
 //      consumerProducer();
    }

    private static void sequentialVsParallelStreams() {

        String[] randomStrings = {"1", "2", "3", "4", "5"};

        System.out.println("Sequential...");
        run(Arrays.stream(randomStrings).sequential());

        System.out.println("Parallel...");
        run(Arrays.stream(randomStrings).parallel());
    }

    private static void run(Stream<String> stream) {

        stream.forEach(streamElement -> {
            System.out.println(LocalTime.now() + " - time" + streamElement +
                    " - thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    private static void exercise1() {

        new MyThread("One", 2);
        new MyThread("Two", 3);
        new MyThread("Three", 5);
    }

    private static void exercise2() {

        MyRunnable.test2();

        Runnable myRunnable = new MyRunnable("Four");
        new Thread(myRunnable);
    }

    private static void singletonEx() {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Connection.getInstance().hashCode())).start();
        }
    }

    private static void consumerProducer() {

        // Static sync vs normal sync
        LinkedList<String> list = new LinkedList<>();
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);
        consumer.consume();
        producer.produce();
    }

    private static void joinExample() {

        new MyThread("One", 2);
        new MyThread("Two", 3);
    }

}
