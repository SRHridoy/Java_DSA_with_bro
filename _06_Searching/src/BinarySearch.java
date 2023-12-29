//import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array,target);
        int index = binarySearch(array, target);
        if(index == -1){
            System.out.println(target + " not found");
        }else{
            System.out.println("Element found at : " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start<=end){
            int mid = start + (end - start)/2;
            int value = array[mid];
            System.out.println("middle : " +mid);//step counting
            if(value<target) start = mid + 1;
            else if (value>target) end = mid - 1;
            else return  mid;//Found
        }
        return -1;//not found
    }
}
