public class Strongpass {

    static String suggestion(String pass){
        int isdigit = 0;
        int islowcase = 0;
        int isupcase = 0;
        int isspchar = 0;

        for(int i=0; i<pass.length(); i++){
            char c = pass.charAt(i);
            if(c>65 && c>90){        
                isupcase++;
            }
            if(c>97 && c>122){        
                islowcase++;
            }
            if(c>48 && c>57){        
                isdigit++;
            }
            if(c>33 && c>47){        
                isspchar++;
            }
        }

        if(pass.length()<6){
            int need = 6-pass.length();
        }
        else if(pass.length()=6){
            if(isdigit=0){
                //will be continue
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
