package basic.collection.queue;

import java.util.PriorityQueue;

public class JavaPriorityQueue {

    public void priorityQueueMethod() {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Stephen");
        priorityQueue.add("Young");
        priorityQueue.add("Yang");
        System.out.println("peek:" + priorityQueue.peek());
        System.out.println("element:" + priorityQueue.element());
        printQueue(priorityQueue);

        System.out.println("remove:" + priorityQueue.remove());
        System.out.println("poll:" + priorityQueue.poll());
        printQueue(priorityQueue);
    }

    private void printQueue(PriorityQueue<String> priorityQueue) {
        System.out.println("iterating the queue elements:");
        priorityQueue.forEach(System.out::println);
    }
}
