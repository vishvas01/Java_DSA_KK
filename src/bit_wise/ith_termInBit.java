package bit_wise;

public class ith_termInBit {
    public static void main(String[] args) {
        int bit = 10001101;
        //printing 5th bit
        System.out.println(bit&(1<<4));
    }
}
