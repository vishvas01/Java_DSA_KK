package subset_subseq;
import java.util.ArrayList;


public class subseq {
    public static void main(String[] args) {
        System.out.println(subseqList("", "abc"));
    }

    static void subsequences(String ans,String word){
        if(word.isEmpty()){
            System.out.println(ans);
            return;
        }
        subsequences(ans, word.substring(1));
        subsequences(ans+ word.charAt(0), word.substring(1));        
    }

    static ArrayList<String> subseqList(String ans, String word){
        if(word.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> left = subseqList(ans,word.substring(1));
        ArrayList<String> right = subseqList(ans+word.charAt(0),word.substring(1));
        left.addAll(right);
        return left;
    }
}
