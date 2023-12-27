# Java_DSA_with_bro

> # Stack :

Stack = LIFO data Structure. Last-in First-Out
* Stores objects into a sort of "vertical tower"
* push() to add to the top
* pop() to remove from the top

```java
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        
        stack.push("C");
        stack.push("C++");
        stack.push("Java");
        stack.push("Kotlin");

        System.out.println(stack.empty());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        

        //java.util.EmptyStackException     
                // stack.pop();
                // System.out.println(stack);
        
        //Jodi ekdom top element e jai ebong eta pop kori thokhn eta oi object return kore tai eta jodi amader korkar hoi taile amra eta assign kore rakhbo...

        //String myFavLang = stack.pop();
        //System.out.println(myFavLang);

        //Kintu evabe korleo pop hoye stack khali hoye jai tai amra top dekhte peek() use kori...:

        System.out.println(stack.peek());


        //Kono kisu search korte hole :
        System.out.println(stack.search("Java"));//na thakle -1 return korbe...
        stack.push("C++");
        stack.push("Java");
        stack.push("Kotlin");
        System.out.println(stack.search("C"));//paile position return korbe...but ekhane top to bottom hisab kora lagbe ke age k pore...

        for(int i = 0; i < 10; i++){
            stack.push("Objective C");
        }

        
    }
}
```

### Uses of Stacks :
1. Undo/redo features in text-editors
2. Movig back/forward through browser history
3. Backtracking algorithms(maze, file directories)
4. Calling functions(call stack)


> # Queue :

Queue = FIFO data structure. First-In First-Out(ex- A line of people)
* A collection designed for holding elements prior to processing
* It's a linear data structure

```java
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
```

## Where are queues useful?
1. Keyboard Buffer(letters should appear on the screen in the order they're pressed)
2. Printer Queue(Print jobs should be completed in order)
3. Used in Linedlists, PriorityQueues, Breadth-first Search(BFS)...

> # Priority Queue :

Priority Queue = A FIFO data structure that serves elements with the highest priorities first before elements with lowe priority.

```java
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
```

> # LinkedLists(singly):

