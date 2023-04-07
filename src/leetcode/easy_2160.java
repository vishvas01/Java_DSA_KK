package leetcode;
import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        for(int i=0;i<digits.length;i++){
            digits[i]=num%10;
            num=num/10;
        }
        Arrays.sort(digits);
        return ((digits[0]*10+digits[3])+(digits[1]*10+digits[2]));
    }
}