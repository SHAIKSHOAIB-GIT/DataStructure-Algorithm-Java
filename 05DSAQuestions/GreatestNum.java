public class GreatestNum {
    public int Gnum(int a, int b){
        int c = a>b?a:b;
        return c;
    }
    public static void main(String[] args) {
        GreatestNum obj = new GreatestNum();
        System.out.println(obj.Gnum(23, 022));
    }
    
}
