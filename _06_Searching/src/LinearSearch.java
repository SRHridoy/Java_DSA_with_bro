public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,3,2,4,3,4,6,7,5,55};
        int index = linearSearch(array, 8);
        if (index != -1){
            System.out.println("Element found at index : " + index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
}