public class SubString {

    static String rev(String s){
        char[] c = s.toCharArray();
        int i = 0;
        int n = c.length-1;
        while (i<=n) {
            char temp = c[i];
            c[i] = c[n];
            c[n] = temp;
            i++;
            n--;
        }
        return new String(c);
    }

    static String substrings(String s,int len){
        int start = s.length()-len;
        
        for()
    }
    public static void main(String[] args) {
        String s = "shaons";
        System.out.println(rev(s));
        
    }
}
