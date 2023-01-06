package bit_wise;

public class odd_even {
    public static void main(String[] args) {
        int a=12;
        if((a & 1 )== 1){
            System.out.println(a+" is odd");
        }
        else{
            System.out.println(a+" is even");
        }
    }
}
