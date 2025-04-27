// Take an array of Strings input from the user & find the cumulative (combined) 
// length of all those strings.

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];

        int lengthCount=0;
        for(int i=0; i<size; i++){
            arr[i] = sc.next();
            lengthCount +=arr[i].length();
        }

        System.out.println(lengthCount);
    }
}
