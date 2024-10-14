package recursion.programs;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int [] arr = {1,4,78,8,2,1,8};
        int target = 8 ;
        System.out.println(check(arr,target,0,new ArrayList<>()));
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
}
