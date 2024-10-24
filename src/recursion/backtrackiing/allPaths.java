package recursion.backtrackiing;

public class allPaths {
    public static void main(String[] args) {
        boolean [] [] mat = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        path(0,0,mat,"");
    }
    static void path(int r, int c, boolean [][] maze, String p) {
        if (r == maze.length -1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        maze[r][c]= false ;
        if (r < maze.length-1) {
            path(r+1,c,maze,p+"R");
        }
        if (c < maze[0].length-1) {
            path(r,c+1,maze,p+"D");
        }
        if (r>0) {
            path(r-1,c,maze,p+"U");
        }
        if (c>0) {
            path(r,c-1,maze,"L");
        }
        maze[r][c]= true;
    }
}
