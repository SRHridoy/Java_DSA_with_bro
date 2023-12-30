public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};

        insertionSort(array);

        for(int i:array){
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;

            while (j>=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
