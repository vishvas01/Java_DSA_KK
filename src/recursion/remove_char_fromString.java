package recursion;

public class remove_char_fromString {
    public static void main(String[] args) {
        String word = "abbcdacdac";
        System.out.println(remove2( word));
    }

    static void remove1(String ans, String word){
        if(word.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = word.charAt(0);
        if(ch=='a'){
            remove1(ans, word.substring(1));
        }else{
            remove1(ans+ch, word.substring(1));
        }
    }

    static String remove2(String word){
        if(word.isEmpty()){
            return "";
        }
        char ch = word.charAt(0);
        if(ch=='a'){
            return remove2(word.substring(1));
        }else{
            return ch+remove2(word.substring(1));
        }
    }
}
