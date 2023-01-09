package bit_wise;

public class power0f_two {
    public static void main(String[] args) {
        int n = 256;
        if((n&n-1)==0){
            System.out.println("it is power of 2");
        }
        else{
            System.out.println("it is not power of 2");
        }
    }
}
