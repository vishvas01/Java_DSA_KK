package back_tracking;
public class backtracking{
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        pathbacktracking("", maze, 0, 0);
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
}