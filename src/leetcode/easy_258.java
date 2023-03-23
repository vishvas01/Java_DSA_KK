package leetcode;
class Solution {
    public int addDigits(int num) {
        return sum(num);
    }

    int sum(int n){
        if(n<10){
            return n;
        }
        int sum=0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum(sum);
    }
}