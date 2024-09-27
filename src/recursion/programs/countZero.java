package recursion.programs;

public class countZero {
    public static void main(String[] args) {
        System.out.println(countZeroes(120405));
    }
    static int countZeroes(int n ) {
        return helper(n, 0);
    }
    static int helper(int n , int count) {
        if (n == 0 ) {
            return count;
        }
        if (n%10 == 0 ) {
            return helper(n/10,count+1);
        } else {
            return helper(n/10,count);
        }
    }
}
