import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
    //Ascending Order Normally :
        Queue<String> pQueue = new PriorityQueue<>();
    //Decending Order :
        Queue<String> pQueue2 = new PriorityQueue<>(Collections.reverseOrder());


        pQueue.offer("A");
        pQueue.offer("AB");
        pQueue.offer("ABC");
        pQueue.offer("ABCD");
        pQueue.offer("ABCDE");
        
        pQueue2.offer("A");
        pQueue2.offer("AB");
        pQueue2.offer("ABC");
        pQueue2.offer("ABCD");
        pQueue2.offer("ABCDE");

        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }

        while (!pQueue2.isEmpty()) {
            System.out.println(pQueue2.poll());
        }
    }
}
