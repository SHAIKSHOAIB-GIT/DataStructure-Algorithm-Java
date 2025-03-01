public class reverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = reverse(str);
        System.out.println(reversed);  // Output: olleh
    }

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Swap characters at left and right indexes
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
}
