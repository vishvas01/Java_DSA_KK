package bit_wise;

public class magicNumbers {
    public static void main(String[] args) {
        int n=3;
        int base=5;
        int ans=0;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans = ans + base*last;
            base=base*5;
        }
        System.out.println(ans);
    }
}
