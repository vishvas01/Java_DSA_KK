package recursion;

public class reverse_num {
    static int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        rev1(n/10);
    }

    // static int base=0;
    static int rev2(int n){
        int digit = (int)(Math.log10(n)+1);
        return helper(n, digit);
    }
    static int helper(int n, int base){
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10, base-1))+ helper(n/10, base-1);
    }

    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
        System.out.println(rev2(346));
    }
}
