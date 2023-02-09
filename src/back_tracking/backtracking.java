package back_tracking;

import java.util.Arrays;

public class backtracking{
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        pathbacktrackingprint("", maze, 0, 0,path,1);
    }

    static void pathbacktracking(String ans,boolean[][] map,int r,int c){
        if(r==map.length-1&&c==map[0].length-1){
            System.out.println(ans);
            return;
        }

        if(!map[r][c]){
            return;
        }
        map[r][c]= false;
        
        if(r<map.length-1){
            pathbacktracking(ans+"D", map, r+1, c);
        }if(c<map[0].length-1){
            pathbacktracking(ans+"R", map, r, c+1);
        }
        if(r>0){
            pathbacktracking(ans+"U", map, r-1, c);
        }
        if(c>0){
            pathbacktracking(ans+"L", map, r, c-1);
        }
        map[r][c]= true;
    }

    static void pathbacktrackingprint(String ans,boolean[][] map,int r,int c,int[][] path,int step){
        if(r==map.length-1&&c==map[0].length-1){
            path[r][c]= step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        if(!map[r][c]){
            return;
        }
        map[r][c]= false;
        path[r][c]= step;
        
        if(r<map.length-1){
            pathbacktrackingprint(ans+"D", map, r+1, c,path,step+1);
        }if(c<map[0].length-1){
            pathbacktrackingprint(ans+"R", map, r, c+1,path,step+1);
        }
        if(r>0){
            pathbacktrackingprint(ans+"U", map, r-1, c,path,step+1);
        }
        if(c>0){
            pathbacktrackingprint(ans+"L", map, r, c-1,path,step+1);
        }
        map[r][c]= true;
        path[r][c]= 0;
    }
}