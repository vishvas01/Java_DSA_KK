package recursion;

public class plaindrome {
       // static int base=0;
    static int rev(int n){
        int digit = (int)(Math.log10(n)+1);
        return helper(n, digit);
    }
    static int helper(int n, int base){
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10, base-1))+ helper(n/10, base-1);
    }

    static boolean palin(int n){
        return (n==rev(n));
    }

    public static void main(String[] args) {

        System.out.println(palin(12321));
    }
}
