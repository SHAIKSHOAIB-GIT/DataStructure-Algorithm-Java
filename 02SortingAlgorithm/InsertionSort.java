import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] arr){
        int size = arr.length;
        for(int i=1;i<size;i++){
            int key = arr[i];
            int j = i-1;
            while (j >=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
           
        } return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));

        sort(arr); 
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    
}
