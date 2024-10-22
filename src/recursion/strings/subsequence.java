package recursion.strings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        System.out.println( subsequenceList("","abcd"));
    }
    static void sub(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(p+ch,up.substring(1));
        sub(p ,up.substring(1));
    }
    // return an array list

    static ArrayList<String> subsequenceList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> left = subsequenceList(p + up.charAt(0) , up.substring(1));
        ArrayList<String> right = subsequenceList(p,up.substring(1));
        left.addAll(right);
        return left ;
    }
}
