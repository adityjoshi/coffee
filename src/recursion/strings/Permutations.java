package recursion.strings;

public class Permutations {
    public static void main(String[] args) {
        per("","abc");
    }
    static void per(String p , String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char start = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String f = p.substring(i,p.length());
            per(f + start + s,up.substring(1));
        }
    }
}

/*
abc
acb
cab
bca
cab
cba
 */