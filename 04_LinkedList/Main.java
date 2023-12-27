import java.util.LinkedList;

public class Main {
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
}
