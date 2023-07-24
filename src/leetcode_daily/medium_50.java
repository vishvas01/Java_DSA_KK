class Solution {
    public double myPow(double x, int n) {
        long pow = Math.abs((long)n);
        //System.out.println("pow" + pow);
        double res =  binPow(x, pow);
        return (n < 0) ? (1/res) : res;
    }
    private double binPow(double x, long n){
        //System.out.println(n);
        if(n == 1)return x;
        if(n == 0)return 1.0;
        double result = binPow(x, n/2);
        result *= result; 
        if(n % 2 == 1){
          result *= x;
        }
        return result;
    }
}