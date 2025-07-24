public class vowels {

    static int isvowel(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        String s = "voewls";
        
        System.out.println(isvowel(s));
       
        
    }
}
