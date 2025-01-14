import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr){
        for (int i=1; i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] =key;
            }
        }


    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr);  
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
    
