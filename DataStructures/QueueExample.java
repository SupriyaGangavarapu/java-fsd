package SortingTechniques;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> locationsQueue = new LinkedList<>();
        locationsQueue.add("Hyderabad");
        locationsQueue.add("Patna");
        locationsQueue.add("Chennai");
        locationsQueue.add("Delhi");
        locationsQueue.add("Noida");
        System.out.println("queue is: "+locationsQueue);
        System.out.println("head of queue: "+locationsQueue.peek());
        locationsQueue.remove();
        System.out.println("After removing head of queue: " + locationsQueue);
        //int deletedElement = locationsQueue.poll();
        //System.out.println("Deleted element: " + deletedElement);
        System.out.println("size of Queue: " + locationsQueue.size());
    }
}
