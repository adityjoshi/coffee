package recursion.backtrackiing;

public class maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path(2,2,"");
        boolean [] [] mat = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
       mazeObstacles(0,0,mat,"");
    }
    static int count(int r, int c) {
        if (r==1 || c ==1) {
            return  1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }

    static void path(int r, int c, String p) {
        if (r==0 && c==0) {
            System.out.println(p);
            return ;
        }
        if (r>0) {
            path(r-1,c,p+"D");
        }
        if (c>0) {
            path(r,c-1,p+"R");
        }
        if (r>0&&c>0) {
            path(r-1,c-1,p+"S");
        }
    }

    static void mazeObstacles(int r, int c , boolean [][] maze, String p) {
        if(r==maze.length-1&&c==maze[0].length-1) {
            System.out.println(p);
            return;
        }
      if (!maze[r][c]) {
          return;
      }
      if (r < maze.length-1) {
          mazeObstacles(r+1,c,maze,p+"R");
      }
      if (c < maze[0].length-1) {
            mazeObstacles(r,c+1,maze,p+"D");
        }
    }
}
