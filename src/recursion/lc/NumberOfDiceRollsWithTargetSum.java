package recursion.lc;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
        die("",4);
    }
    static void die(String p , int target) {
        if (target == 0 ) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            die(p+i,target-i);
        }
    }
}
