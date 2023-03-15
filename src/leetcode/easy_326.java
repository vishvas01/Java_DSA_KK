package leetcode;
class Solution {
    public boolean isPowerOfThree(int n) {
        return ispower(n);
    }

    boolean ispower(int n){
        if(n==1){
            return true;
        }
        if(n<=0||n%3!=0){
            return false;
        }
        return ispower(n/3);
    }
}