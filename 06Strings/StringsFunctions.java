public class StringsFunctions {
    public static void main(String[] args) {
        String fristname = "shaik";
        String lastname = "shoaib";
        String fullname = fristname + " " + lastname;
        System.out.println(fullname);

        // chatat
        for(int i=0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i));
        }
        System.out.println();
        
        // campareto
        if(fristname.compareTo(lastname)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }

        // substring
        System.out.println(fullname.substring(3, 10));

        // parseint
        String strint = "123";
        int num = Integer.parseInt(strint);
        System.out.println(num);
        
        // tostring
        String newstr = Integer.toString(num);
        System.out.println(newstr);
    }    
}
