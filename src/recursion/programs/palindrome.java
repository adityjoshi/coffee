package recursion.programs;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(pal(1021));
    }
    static boolean pal(int n ) {
        return n == helper(n);
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
