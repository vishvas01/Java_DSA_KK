package leetcode;
public class hard_37 {
    public static void main(String[] args) {
        char[][] board= {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6','.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, 
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}  
//              {'3', '1', '6', '5', '7', '8', '4', '.', '2'},
// {'5','2', '9', '1', '3', '4', '.', '6', '.'},
// {'4', '8', '7', '.', '2', '9', '.', '3', '1'},
// {'2', '6', '3', '.', '1', '5', '9', '8', '7'},
// {'9', '.', '4', '8', '6', '3', '1', '2', '5'},
// {'.', '5', '1', '7', '9', '2', '6', '4', '3'}, 
// {'1', '3', '.', '9', '4', '7', '2', '5', '6'},
// {'6', '9', '2', '3', '5', '1', '.', '7', '4'},
// {'7', '4', '5', '2', '8', '6', '3', '.', '9'}    
    }; solveSudoku(board);
}
    public static void solveSudoku(char[][] board) {
        if(checker(board)){
            display(board);
        }else{
            System.out.println("cannot solve");
        }
    }

    public static boolean checker(char[][] board){
        // if(r==board.length){
        //     return true;
        // }
        // if(c==board.length){
        //     r = r+1;
        //     c=0;    
        // }
        boolean empty=false;
        int r=-2,c=-1;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                   
                    r=i;
                    c=j;
                    empty=true;
                    break;
                }
            }
            if(empty==true){
                break;
            }
        }
        if(!empty){
            return true;
        }

        for(char digit='1';digit<='9';digit++){
            if(isSafe(board,r,c,digit)){
                board[r][c]=digit;
               if(checker(board)){
                return true;
               }else{
                board[r][c]='.';
                //checker(board, r, c+1);
               }
            }
        }
        return false;
    }

    public static void display(char[][] board) {
        for(char[] row: board){
            for(char digit: row){
                System.out.print(digit);
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board,int r,int c,char digit){
        //checking in row
        for(int i=0;i<board.length;i++){
           if(board[r][i]==digit){
            return false;
           }
        }
         //checking in col
         for(int i=0;i<board.length;i++){
            if(board[i][c]==digit){
             return false;
            }
        }
        // checking for grid

        int rowStart = r - r%3;
        int colStart = c - c%3;
        for(int i=rowStart;i<rowStart+3;i++){
            for(int j=colStart;j<colStart+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

}
