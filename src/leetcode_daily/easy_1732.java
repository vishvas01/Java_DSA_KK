public class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        for(int current:gain){
            sum= sum + current;
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
} 
