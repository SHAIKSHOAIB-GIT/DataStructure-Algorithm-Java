import java.util.Arrays;

public class RotatebyNplaces {
    public static void rev(int[] arr,int left,int right){
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        rev(arr, 0, n-1);

        rev(arr, 0, k-1);

        rev(arr, k, n-1);

    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,7,8,9};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}