package recursion.programs;

public class IsSoretedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 24, 56, 57};
        System.out.println(isSoreted(arr,0));
    }
    static boolean isSoreted (int [] arr, int index) {
        if (index == arr.length - 1) {
            return true ;
        }
        return arr[index]<arr[index+1] && isSoreted(arr,index+1);
    }
}
