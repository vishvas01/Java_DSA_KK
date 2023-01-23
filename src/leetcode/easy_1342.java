package leetcode;

import bit_wise.remove_duplicate;

class Solution {
    public static void main(String[] args) {
        
    }
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    public int helper(int n , int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}
