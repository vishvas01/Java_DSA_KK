package leetcode;

public class easy_1812 {
    public static void main(String[] args) {
        String a = "b1";
        System.out.println(squareIsWhite(a));
    }
    public static boolean squareIsWhite(String coordinates) {

           return (((int)coordinates.charAt(0)%97)+coordinates.charAt(1))%2 == 0;  
            }
    }