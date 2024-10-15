package recursion.programs;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,8,1};
        selection(arr, 0,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr , int index, int high ,int length) {
        if (length == 0 ) {
            return;
        }
      if (index < length) {
          if (arr[index] > arr[high]) {
              selection(arr,index+1,index,length);
          } else {
              selection(arr,index+1,high,length);
          }
      } else {
          int temp = arr[high];
          arr[high] = arr[length-1];
          arr[length-1] = temp;
          selection(arr,0,0,length-1);
      }
    }
}
