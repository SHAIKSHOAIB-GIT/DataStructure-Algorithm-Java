import java.util.Scanner;

public class LinearSearch {
    public int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) { // Use index-based loop
            if (arr[i] == n) {
                System.out.println("The number " + n + " is found at index " + i);
                return i; // Return the index of the found element
            }
        }
        System.out.println("The number " + n + " is not found in the array.");
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 23, 34, 45, 53};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        int N = input.nextInt();
        LinearSearch search = new LinearSearch();
        search.linearSearch(arr1, N);
        input.close();
    }
}

