import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] arr){
        int size = arr.length;
        for(int i=0;i<size-1;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }return arr;
    }
    public static void main(String[] args) {
        
       
        int[] arr = {5, 4, 8, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));

        sort(arr); // Sort the array using bubble sort
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
    
    

