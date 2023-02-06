package subset_subseq;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
       System.out.println(dicearraylist("", 4));
    }

    static void diceprint(String ans,int n){
        if(n==0){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=6&i<=n;i++){
            diceprint(ans+i, n-i);
        }
    }

    static ArrayList<String> dicearraylist(String ans,int n){
        if(n==0){
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(ans);
            return list1;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6&i<=n;i++){
            list.addAll(dicearraylist(ans+i, n-i));
        }
        return list;
    }


}
