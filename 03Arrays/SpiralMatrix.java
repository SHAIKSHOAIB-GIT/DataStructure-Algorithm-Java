import java.util.Scanner;

public class SpiralMatrix {
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
        System.out.println("The Spiral Matrix: ");
        int StartRow=0;
        int EndRow=n-1;
        int Startcolum=0;
        int EndColum=m-1;
         //To print spiral order matrix
      while(StartRow <= EndRow && Startcolum <= EndColum) {
        for(int i=Startcolum; i<EndColum; i++){
            System.out.println(matrix[StartRow][EndColum] + " ");
        }
        StartRow++;
      }
    //pending working onit   

    }
}
