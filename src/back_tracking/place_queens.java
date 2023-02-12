package back_tracking;

public class place_queens {
    public static void main(String[] args) {
        int n=10;
        boolean[][] board= new boolean[n][n];
        System.out.println(placequeens(board, 0));
    }

    static int placequeens(boolean[][] board,int r){
        if(r==board.length){
            display(board);
            System.out.println();
            return 1;            
        }
        int count=0;

        for(int c=0;c<board.length;c++){
            if(safe(board,r,c)){
                board[r][c]=true;
                count= count+ placequeens(board, r+1);
                board[r][c]=false;
            }
        }
        return count;
    }

    static boolean safe(boolean[][] board, int r, int c) {
        for(int i=r;i>=0;i--){
            if(board[i][c]==true){
                return false;
            }
        }
        int maxleft = Math.min(r, c);
        for(int i=1;i<=maxleft;i++){
            if(board[r-i][c-i]==true){
                return false;
            }
        }

        int maxright = Math.min(r, board.length-1-c);
        for(int i=1;i<=maxright;i++){
            if(board[r-i][c+i]==true){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean element:row){
                if(element==true){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}