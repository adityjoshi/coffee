package recursion.programs;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {2,3,5,6};
        int target = 5 ;
        System.out.println( bs(arr,0,arr.length-1,target));
    }
    static int bs(int [] arr, int s , int e , int target) {
        // base condition
        if (s>e) {
            return - 1;
        }
        int m =  s + (e-s)/2;

        if (arr[m] == target) {
            return m;
        }
        if (arr[m]>target) {
            return bs(arr,s ,m-1,target);
        }
        return bs(arr,s+1,e,target);
    }
}
