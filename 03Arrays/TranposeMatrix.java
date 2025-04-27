import java.util.Scanner;

public class TranposeMatrix {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose Matrix : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
}
