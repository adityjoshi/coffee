package recursion.backtrackiing;

public class allPaths {
    public static void main(String[] args) {
        path(2,2,"");
    }
    static void path(int r, int c, String p) {
        if (r == 0 && c == 0) {
            System.out.println(p);
            return;
        }
        if (r>0) {
            path(r-1,c,p+"R");
        }
        if (c>0) {
            path(r,c-1,p+"D");
        }
        if (r<2) {
            path(r+1,c,p+"U");
        }
        if (c<2) {
            path(r,c+1,"L");
        }
    }
}
