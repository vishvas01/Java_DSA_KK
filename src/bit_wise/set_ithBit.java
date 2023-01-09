package bit_wise;

public class set_ithBit {
    public static void main(String[] args) {
        int bit=  (byte) 10001101;
        //setting 5th bit as 1
        System.out.println(bit|(1<<4));
    }
}
