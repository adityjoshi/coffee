package recursion.programs;

public class reversePrint {
    public static void main(String[] args) {
        num(5);
    }
    static void num(int n ) {
        // base condition 
        if (n==0) {
            return;
        }
        System.out.println(n);
       num(n-1);

    }
}
