import java.util.Scanner;

public class WalkinRow {
    static int width(int[] arr, int h){
        int width =0;
        for(int i =0; i<arr.length; i++){
            if (arr[i]>h){
                width+=2;
            }
            else{
                width++;
            }
        }
        return width;
    }

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int[] a ={4,5,5,12,7};
        int h = 5;
        System.out.print(width(a, h));
    }
}
