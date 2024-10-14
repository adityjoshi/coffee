package recursion.programs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int [] arr = {1,4,78,8,2,1,8};
        int target = 8 ;
        System.out.println(check2(arr,target,0));
    }
    static ArrayList<Integer> check(int [] arr, int target , int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
            return check(arr,target,index+1,list);
    }
    static ArrayList<Integer> check2(int [] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = check2(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }
}
