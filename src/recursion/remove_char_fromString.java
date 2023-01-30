package recursion;

public class remove_char_fromString {
    public static void main(String[] args) {
        String word = "abbcdacdac";
        System.out.println(remove2( word));
        System.out.println(removeApple("abapplecd"));
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

    static String removeApple(String word){
        if(word.isEmpty()){
            return "";
        }
        
        if(word.startsWith("apple")){
            return removeApple(word.substring(5));
        }else{
            return word.charAt(0)+removeApple(word.substring(1));
        }
    }
}
