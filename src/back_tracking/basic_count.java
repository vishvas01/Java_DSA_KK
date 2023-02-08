package back_tracking;

public class basic_count {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    static int count(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        int count=0;
        count = count(row-1,col)+count(row, col-1);
        return count;
    }
}
