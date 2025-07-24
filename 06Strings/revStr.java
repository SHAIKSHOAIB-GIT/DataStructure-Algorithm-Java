public class revStr {

    static String rev(String s){
        String t="";
        for(int i=s.length()-1; i>=0; i--){
            t=t+s.charAt(i);
        }
        return t;
    }
    static boolean palidrome(String s){
        
        if(s.equals(rev(s))){
            return true;
        }
       
        return false;
    }
    public static void main(String[] args) {
        String s = "somos";
        
        System.out.println(rev(s));
        System.out.println(palidrome(s));
    }
    
}
