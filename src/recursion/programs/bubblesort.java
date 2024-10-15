package recursion.programs;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        bubble(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr, int index , int length) {
        if (length  == 0) {
            return;
        }
        if (index < length) {
            if (arr[index] > arr[index+1]) {
                int temp = arr [index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;

            }
            bubble(arr,index+1,length);
        } else {
            bubble(arr,0,length-1);
        }

    }
}
