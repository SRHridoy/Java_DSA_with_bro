public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        selectionSort(array);
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
