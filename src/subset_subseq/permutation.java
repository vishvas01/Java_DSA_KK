package subset_subseq;

public class permutation {
    public static void main(String[] args) {
        pnc("", "abc");
    }

    static void pnc(String ans, String word){
        if(word.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<=ans.length();i++){
            String a = ans.substring(0,i);
            String b = ans.substring(i,ans.length());
            pnc(a+word.charAt(0)+b, word.substring(1));
        }
    }
}
