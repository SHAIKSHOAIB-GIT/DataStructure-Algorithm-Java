public class revWordSentence {
    public static void rev(char[] arr, int left, int right ){
        while (left<right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static String revWord(String str){
        char[] arr = str.toCharArray();
        int right = str.length()-1;
        rev(arr, 0, right);
        // reversing each word
        int start = 0;
        for(int end = 0; end < arr.length; end++){
            if (arr[end] == ' '){
                rev(arr, start, end-1);
                start = end + 1;
            }
        }
        rev(arr, start, right);


        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "shoaib love coding";
        System.out.println(revWord(str));
    }
}
