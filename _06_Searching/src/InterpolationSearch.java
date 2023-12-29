public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int index = interpolationSearch(array, 256);

        if(index != -1){
            System.out.println("Element found at index : " + index);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (target >= array[start] && target <= array[end] && start <= end){
            int probe = start + (end - start) * (target - array[start])/(array[end] - array[start]);

            System.out.println("probe : " + probe);

            if(array[probe] == target){
                return probe;
            }
            else if(array[probe] < target){
                start = probe + 1;
            }else {
                end = probe - 1 ;
            }
        }
        return -1;
    }
}
