package thread;

import java.util.LinkedList;

public class ThreadClass {

    private static boolean needMore;

    public void testThread() {
        LinkedList<String> beers = new LinkedList<>();
        Thread producer = new Thread(new Producer(beers));
        Thread consumer = new Thread(new Consumer(beers));

        producer.start();
        try {
            producer.join();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        consumer.start();
    }

    public static class Producer implements Runnable {

        private final LinkedList<String> beers;

        public Producer(LinkedList<String> beers) {
            this.beers = beers;
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                synchronized (ThreadClass.class) {
                    System.out.println("Add beer " + i);
                    beers.add("beer" + i++);
                    if (beers.size() > 5) {
                        try {
                            ThreadClass.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static class Consumer implements Runnable {

        private final LinkedList<String> beers;

        public Consumer(LinkedList<String> beers) {
            this.beers = beers;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (ThreadClass.class) {
                    if (beers.size() <= 0) {
                        System.out.println("There is no beers");
                        Thread.class.notify();

                        try {
                            Thread.currentThread().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    beers.removeFirst();
                }
            }
        }
    }
}
