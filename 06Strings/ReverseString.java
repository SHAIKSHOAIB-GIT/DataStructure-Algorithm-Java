// 1. Reverse a String 

import java.util.Scanner;

public class ReverseString{
    // Write a function to reverse a string.
    public static String rev(String str){
        char[] chararray = str.toCharArray();
        int left=0;
        int right=str.length()-1;
        
        for(int i=left; i<right; i++){
            char temp = chararray[left];
            chararray[left] = chararray[right];
            chararray[right] = temp;
            right--;
            left++;
        }

        return new String(chararray);
    }
    public static void main(String[] args) {
        String str = "hello";
        String Rev = rev(str);
        System.out.println(Rev);
        // Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // // hellow
        // for(int i=0; i<str.length()/2; i++){
        //     int fornt = i;
        //     int back = str.length() - 1 - i; 

        //     char charfornt = str.charAt(fornt);
        //     char charback = str.charAt(back);

        //     str.setCharAt(fornt, charback);
        //     str.setCharAt(back, charfornt);
        // }
        // System.out.println(str);
    }

}

