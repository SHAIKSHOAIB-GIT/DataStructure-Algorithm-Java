import java.util.Scanner;

public class AngryProf {
    static String checkontime(int arr[], int k) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 0) {
                count++;
            }
        }
        if(count >= k) {
            return "NO"; // Class is NOT cancelled
        } else {
            return "YES"; // Class is cancelled
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // Number of students
        int k = scan.nextInt(); // Minimum number of students required to be on time

        int a[] = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println(checkontime(a, k));
    }
}
