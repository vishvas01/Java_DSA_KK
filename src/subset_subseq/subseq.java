package subset_subseq;

public class subseq {
    public static void main(String[] args) {
        subsequences("", "abc");
    }

    static void subsequences(String ans,String word){
        if(word.isEmpty()){
            System.out.println(ans);
            return;
        }
        subsequences(ans, word.substring(1));
        subsequences(ans+ word.charAt(0), word.substring(1));        
    }
}
