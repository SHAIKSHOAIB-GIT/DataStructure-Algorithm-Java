import java.util.Scanner;

public class BinarySearch {
    public static void binarySearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length-1;
        
        while (left<=right){
            int mid = left + (right-left)/2;

            if(n==arr[mid]){
                System.out.println("The element found at index " + mid);
                return;
            }
            else if(arr[mid]<n)
                left = mid+1;
            else 
                right = mid-1;    
        }
        System.out.println("The number " + n + " is not found in the array.");
    }

    public static void main(String[] args){
        int[] arr1 = {12, 13, 14, 23, 24, 45, 67, 78};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int N = input.nextInt();
        binarySearch(arr1, N);
        input.close();
    }
}
