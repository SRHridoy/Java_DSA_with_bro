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
        
        //Jodi ekdom top element e jai ebong eta pop kori thokhn eta oi object return kore tai eta jodi amader dorkar hoi taile amra eta assign kore rakhbo...

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
3. Used in Linkedlists, PriorityQueues, Breadth-first Search(BFS)...

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
LinkedList = stores Nodes in 2 parts (data + address)

    >>Nodes are in non-consecutive memory locations
    >>Elements are linked using pointers

## Singly Linked List :
```java
/*
 *      Node                 Node                Node
 * [data | address] - > [data | address] -> [data | address]
 * 
*/
```

## Doubly Linked List : 
```java
/*
 *      Node                 Node                Node
 * [data | address] < - > [data | address] <-> [data | address]
 * 
*/
```

### Advantages :
1. Dynamic Data Structure (allocates needed while running)
2. Insertion and Deletion of Nodes is east. O(1)
3. No/Low memory waste

### Disadvantages : 
1. Greater memory usage (additional pointer)
2. No random access of elements (no index[i])
3. Accessing / Searching elements is more time consuming. O(n)

### Uses :
1. Implement Stacks/Queues
2. GPS navigation
3. Music Playlist

```java
public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        //Treating as Stack :
        System.out.println("LinkedList as Stack : ");
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");

        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);

        //Treating as Queue : 
        LinkedList<String> linkedList2 = new LinkedList<String>();
        System.out.println("LinkedList as Queue : ");
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");

        System.out.println(linkedList2);

        linkedList2.poll();

        System.out.println(linkedList2);

        //Adding and removing :
        linkedList2.add(2,"ABC");
        System.out.println(linkedList2);
        linkedList2.remove("ABC");
        System.out.println(linkedList2);

        //Searching :
        System.out.println(linkedList2.indexOf("B"));
        //peekFirst(), peekLast():
        System.out.println(linkedList2.peekFirst());
        System.out.println(linkedList2.peekLast());

        //addFirst(),addLast:
        linkedList2.addFirst("00");
        System.out.println(linkedList2);
        linkedList2.addLast("7");
        System.out.println(linkedList2);

        //removeFist(), removeLast();
        linkedList2.removeFirst();
        System.out.println(linkedList2);
        linkedList2.removeLast();
        System.out.println(linkedList2);
    }
```

> # Dynamic Array :
Advantages :
1. Random access of elements O(1)
2. Good locality of reference and data cache utilization
3. East to insert/delete at the end

Disadvantages :
1. Wastes more memory
2. Shifting elements is time-consuming O(n)
3. Expanding/Shrinking the array is time-consuming O(n)

```java
//Custom Dynamic Array Creation :
public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    //Constructors :
    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    //add function :
    public void add(Object data) {
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    //insert function :
    public void insert(int index, Object data) {
        if(size >= capacity){
            grow();
        }
        for (int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    //Delete function :
    public void delete(Object data) {
        for (int i = 0; i < size; i++){
            if(array[i] == data){
                for (int j = 0; j < (size - i - 1); j++){
                    array[i+j] = array[i+j+1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }
    //Search function :
    public int search(Object data){
        for(int i = 0; i < size ; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    //extend size of array :
    private void grow(){
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    //shrink :
    private  void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    //isEmpty():
    public boolean isEmpty(){
        return size == 0;
    }

    //toString();
    public String toString(){
        String string = "";
        for(int i = 0; i < capacity; i++){
            string += array[i] + ", ";
        }
        if(string != ""){
            string ="[" + string.substring(0, string.length() - 2) + "]";
        }else{
            string = "[]";
        }
        return string;
    }

}
```

LinkedList vs ArrayList : 
```java
LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //LinkedList :
        startTime = System.nanoTime();
        //linkedList.get(0);
        //linkedList.get(500000);//it takes much time than 999999 because it's a doubly linked list...
        //linkedlist.get(999999);

        //linkedList.remove(0);
        //linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Linkedlist :\t" + elapsedTime + " ns");
        //ArrayList :
        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrylist.get(999999);


       // arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Arraylist :\t" + elapsedTime + " ns");
```






