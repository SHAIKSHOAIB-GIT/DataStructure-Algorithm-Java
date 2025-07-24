public class space {

    static int cspace(String s){

        int count=0;
        for(int i =0; i<s.length()-1; i++){
            char c = s.charAt(i);
            // you also use ' ', 32 is assci 
            if(c==32){
                count++;
            }
        }
        return count;
    }

     static int cwords(String s){

        int count=0;
        for(int i =0; i<s.length()-1; i++){
            char c = s.charAt(i);
            // you also use ' ', 32 is assci 
            if(c==32){
                count++;
            }
        }
        return count+1;
    }
    

    public static void main(String[] args) {
        String s ="hi i am String";
        System.out.println(cspace(s));
         System.out.println(cwords(s));
    }
}
