package leetcode;

class Solution {
    public boolean isPowerOfTwo(int n) {
        return power(n);
    }

    boolean power(int n){
        
        if(n==1){
            return true;
        }
        if(n%2!=0 || n<=0){
            return false;
        }
        return power(n/2);
    }
}