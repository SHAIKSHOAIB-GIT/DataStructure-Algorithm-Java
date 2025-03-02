public class palindrome {

    public static boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }   
            left++;
            right--;
        }return true;
    }
    
    public static void main(String[] args) {
        String str = "Kommok";
        System.out.println(isPalindrome(str));

    }
}
