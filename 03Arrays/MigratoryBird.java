import java.util.Scanner;

public class MigratoryBird {

     static int birdid(int arr[]){
        int bird[] = new int[arr.length];
        int maxIndx=0, max=-1;
        for(int i=0; i<arr.length; i++){
            bird[arr[i]]++;
        }
        for(int i =1; i<bird.length; i++){
            if(bird[i]>max){
                max=bird[i];
                maxIndx = i;
            }
        }
        return maxIndx;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a ={1,1,2,2,3,2,3};
        System.out.print(birdid(a));
    }
}
