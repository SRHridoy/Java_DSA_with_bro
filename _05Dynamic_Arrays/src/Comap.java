import java.util.ArrayList;
import java.util.LinkedList;

public class Comap {
    public static void main(String[] args) {
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

    }
}
