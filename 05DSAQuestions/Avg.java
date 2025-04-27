public class Avg {
    public int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Avg obj = new Avg();
        int result = obj.avg(2,3,4);
        System.out.println(result);
    }
}
