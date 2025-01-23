import java.util.Arrays;

public class QuickSort {
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i =low - 1;
        for(int j = low; j < high; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    private void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Find the partitioning index
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after partitioning index
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 2, 1};
        int n = arr.length;
        QuickSort sorter = new QuickSort();
        System.out.println("Original Array: " + Arrays.toString(arr));

        sorter.quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
    
