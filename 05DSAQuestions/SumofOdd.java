public class SumofOdd {
    public void Odd(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            if(i%2==0){
                continue;
            }
            else{
                sum+=i;
            }
        }System.out.println(sum);
    }
    public static void main(String[] args) {
        SumofOdd obj = new SumofOdd();
        obj.Odd(21);
    }
}
