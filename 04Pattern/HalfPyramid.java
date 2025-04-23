public class HalfPyramid {
    public static void main(String[] args) {
        int n =4;
        for (int i=1; i<=n; i++){       //for inverted change n to i and i--
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}


