import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //DynamicArray dynamicArray = new DynamicArray(5);
        //System.out.println(dynamicArray.capacity);

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
//        dynamicArray.add("C");
//        dynamicArray.add("D");
//        dynamicArray.add("D");
//        dynamicArray.add("D");
//        dynamicArray.add("D");
//        dynamicArray.add("D");
//        dynamicArray.add("D");
//        dynamicArray.add("D");
//        dynamicArray.add("D");

//        dynamicArray.insert(0,"X");
//        dynamicArray.delete("A");
//        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("Size : " + dynamicArray.size);
        System.out.println("Capacity : " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

    }
}
