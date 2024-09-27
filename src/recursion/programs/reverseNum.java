package recursion.programs;

public class reverseNum {
    public static void main(String[] args) {
        int x = helper(1234);
        System.out.println(x);
    }
    static int reverse(int n, int digits)  {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10,digits-1) + reverse(n/10,digits-1));
    }
    static int helper(int n) {
        int digits = (int)(Math.log10(n)) + 1 ;
        return reverse(n,digits);
    }
}
