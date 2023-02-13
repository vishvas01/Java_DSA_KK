package back_tracking;
class nknights{
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        placeKnights(board, 0, 0, 4);
    }

    static void placeKnights(boolean[][] board,int r,int c,int num){
        if(num==0){
            display(board);
            System.out.println();
            return;
        }
        if(r==board.length-1 && c== board.length){
            return;
        }
        if(c==board.length){
            placeKnights(board, r+1, 0, num);
            return;
        }
        if(isSafe(board,r,c)){
            board[r][c]= true;
            placeKnights(board, r, c+1, num-1);
            board[r][c]= false;
        }
        placeKnights(board, r, c+1, num);
    }

    
    static boolean isSafe(boolean[][] board, int r, int c) {
        if(inrange(board,r-2,c-1)){
                if(board[r-2][c-1]){
                    return false;
                }
        }
        if(inrange(board,r-2,c+1)){
            if(board[r-2][c+1]){
                return false;
            }
        }
        if(inrange(board,r-1,c-2)){
            if(board[r-1][c-2]){
                return false;
            }
        }
        if(inrange(board,r-1,c+2)){
            if(board[r-1][c+2]){
                return false;
            }
        }
        return true;
    }

    static boolean inrange(boolean[][] board, int r, int c) {
        if(r>=0&&r<board.length&&c>=0&&c<board.length){
            return true;
        }
        return false;
    }


    static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean element: row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}