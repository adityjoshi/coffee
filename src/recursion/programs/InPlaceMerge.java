package recursion.programs;


import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
       merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    // just take start mid and end in the argument only
    static void merge(int [] arr, int start, int end) {
        if (end-start == 1) {
            return ;
        }
        int mid = start + (end-start)/2;
        merge(arr,start,mid);
        merge(arr,mid+1,end);

         merging(arr,start,mid,end);
    }
    static void  merging(int [] arr, int start, int mid, int end) {
        int [] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0 ;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
               mix[k] = arr[j];
               j++;
            }
          k++ ;
        }
        // it may be possible one of the array isn't complete
        while (i<mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j<end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
      for (int l = 0 ; l<mix.length; l++) {
          arr[start+l] = mix[l];
      }
    }
}
