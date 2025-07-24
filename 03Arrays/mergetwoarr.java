import java.lang.reflect.Array;
import java.util.Arrays;

public class mergetwoarr {
    static int[] sortarr(int[] a, int[] b){
        int i=0,j=0,k=0;
        int[] res = new int[a.length+b.length];

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k] = a[i];
                i++;
                k++;
            }
            if(a[i]>b[j]){
                res[k] =b[j];
                j++;
                k++;
            }

        }
        while (i<a.length) {
            res[k]=a[i];
            i++;
            k++;
            
        }
        while (j<b.length) {
            res[k]=b[j];
            j++;
            k++;
            
        }
        return res;

    }
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 14, 31};
        int[] b = {11, 12, 13};
        int[] res =sortarr(a, b);
        System.out.println(Arrays.toString(res));
    }
}
