public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};

        int start = 0, end = array.length-1;
        quickSort(array, start, end);

        for(int value:array){
            System.out.print(value+" ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end<=start) return;//base case

        int pivot = partition(array,start,end);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,end);

    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j < end; j++){
            if(array[j]<pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;//that's the right pivot...
    }
}
