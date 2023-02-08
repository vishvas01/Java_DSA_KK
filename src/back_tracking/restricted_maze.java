package back_tracking;
class maze{
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        path("", maze, 0, 0);
    }

    static void path(String ans,boolean[][] map,int r,int c){
        if(r==map.length-1&&c==map[0].length-1){
            System.out.println(ans);
            return;
        }

        if(map[r][c]==false){
            return;
        }
        if(r<map.length-1){
            path(ans+"D", map, r+1, c);
        }if(c<map[0].length-1){
            path(ans+"R", map, r, c+1);
        }
    }
}