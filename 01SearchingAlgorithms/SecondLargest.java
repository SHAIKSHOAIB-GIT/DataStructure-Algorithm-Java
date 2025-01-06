public class SecondLargest {
    public static int secondLargest(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i])
                max=arr[i];    
        }
        int secondMax=arr[0];
        for(int j=1; j<arr.length; j++){
            if((secondMax<arr[j])&&(arr[j]!=max))
                secondMax=arr[j];
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr ={12, 34, 35, 56 ,32, 23, 78};
        System.out.println(secondLargest(arr));

    }
}
