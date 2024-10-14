package recursion.programs;

public class searchLinear {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int target = 5 ;
        System.out.println(search(arr,target,0));
    }
    static boolean search(int [] arr, int target, int index) {
        if (index == arr.length) {
            return false ;
        }
     return  arr[index] == target || search(arr,target,index+1) ;
    }
}
