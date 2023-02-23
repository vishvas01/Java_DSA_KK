package back_tracking;

import java.util.ArrayList;

public class maze_path {
    public static void main(String[] args) {
        System.out.println(countlist_diag("", 3, 3));
    }
    static void count(String ans,int row,int col){
        if(row==1 && col==1){
            // ArrayList<String> path= new ArrayList<>();
            System.out.println(ans);
            return ;
        }
        // int count=0;
        //
        // ArrayList<String> down= new ArrayList<>();
        // ArrayList<String> right= new ArrayList<>();
        if(row>1){
            count(ans+"D",row-1,col);
        }
        if(col>1){
            count(ans+"R",row, col-1);
        }
        // return count;
    }
    static ArrayList<String> countlist(String ans,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> path= new ArrayList<>();
            path.add(ans);
            return path;
        }
        // int count=0;
        ArrayList<String> down= new ArrayList<>();
        ArrayList<String> right= new ArrayList<>();
        if(row>1){
           down.addAll(countlist(ans+"D",row-1,col));
        }
        if(col>1){
            right.addAll(countlist(ans+"R",row, col-1));
        }
        right.addAll(down);
        return right;
    }
    static ArrayList<String> countlist_diag(String ans,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> path= new ArrayList<>();
            path.add(ans);
            return path;
        }
        // int count=0;
        ArrayList<String> down= new ArrayList<>();
        ArrayList<String> right= new ArrayList<>();
        if(row>1&&col>1){
            down.addAll(countlist_diag(ans+"c",row-1,col-1));
        }
        if(row>1){
           down.addAll(countlist_diag(ans+"D",row-1,col));
        }
        if(col>1){
            right.addAll(countlist_diag(ans+"R",row, col-1));
        }
        right.addAll(down);
        return right;
    }
}
