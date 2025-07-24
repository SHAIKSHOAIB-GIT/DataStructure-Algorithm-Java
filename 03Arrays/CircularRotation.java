import java.util.Arrays;
import java.util.Scanner;

public class CircularRotation {

    // Perform k circular rotations and answer q queries
    static int[] CR(int[] a, int k, int[] q){
        int[] res = new int[q.length];
        int[] b = new int[a.length];

        // Circular rotate right by k positions
        for(int i = 0; i < a.length; i++) {
            b[(i + k) % a.length] = a[i];
        }

        // Respond to each query using the rotated array
        for(int i = 0; i < q.length; i++) {
            res[i] = b[q[i]];
        }

        return res;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] a = {1, 2, 3, 4, 3};
        int[] q = {1, 2, 4};

        int[] result = CR(a, k, q);

        // Print the result array properly
        System.out.println("Query results after rotation: " + Arrays.toString(result));
    }
}
