// 2. Palindrome Check 
// Check if a given string is a palindrome.
public class Palindrome {
    public static String CheckPalindrome(String str){
        char[] chararray = str.toCharArray();
        int left =0,right=str.length()-1;
        while (left<right) {
            if(chararray[left] != chararray[right]){
                return "not polindrome";
            }
            right--;
            left++;    
        } 
        return "isPalindrome";
    }
    public static void main(String[] args) {
        String str = "Som amos";
        String ChangeString = str.toLowerCase().replaceAll("\\s+", "");
        String result = CheckPalindrome(ChangeString);
        System.out.println(result);        
    }
}
