public class vowelRev {
    public static String rev(String str){
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length()-1;
        String vowels ="aieouAIEOU";

        while (left<right && vowels.indexOf(charArray[left])==-1) {
            left++;
        }

        while (left<right && vowels.indexOf(charArray[right])==-1) {
            right--;
        }
        char tmp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = tmp;

        left++;
        right--;

        return new String(charArray);
    }
    public static void main(String[] args) {
        String str = "shoaib";
        System.out.println(rev(str));
    }
}
