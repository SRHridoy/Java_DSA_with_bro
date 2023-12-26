import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
    
    //It's an error to instantiate the queue because it's an Interface... Queue use korte Linkedlist or PriorityQueue er instance create korte hobe... karon egula diye implement Queue...
        //Queue<String> queue = new Queue<String>();

        Queue<String> queue = new LinkedList<String>();
        /*
         * add = enqueue, offer()
         * remove = dequeue, poll()
         */

         queue.offer("H");
         queue.offer("Hr");
         queue.offer("Hri");
         queue.offer("Hrid");
         queue.offer("Hrido");
         queue.offer("Hridoy");

         System.out.println(queue);
         System.out.println(queue.peek());

         queue.poll();
         System.out.println(queue.peek());

         //isEmpty():
         System.out.println(queue.isEmpty());
         //size();
         System.out.println(queue.size());
         //contains() return true of false:
         System.out.println(queue.contains("Hri"));

    }
}
