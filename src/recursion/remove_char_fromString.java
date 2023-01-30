package recursion;

public class remove_char_fromString {
    public static void main(String[] args) {
        String word = "abbcdacdac";
        remove("", word);
    }

    static void remove(String ans, String word){
        if(word.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = word.charAt(0);
        if(ch=='a'){
            remove(ans, word.substring(1));
        }else{
            remove(ans+ch, word.substring(1));
        }
    }
}
