import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int size = arr.length;
        int temp;

        for (int i = 0; i < size - 1; i++) { // Loop to control the number of passes
            for (int j = 1; j < size - i; j++) { // Loop to compare adjacent elements
                if (arr[j - 1] > arr[j]) {
                    // Swap adjacent elements if they are in the wrong order
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr); // Sort the array using bubble sort
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
