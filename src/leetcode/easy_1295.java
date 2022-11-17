package leetcode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class easy_1295 {
    public static void main(String[] args) {
        int[] nums = {1,23,234,5542,2276,20,23334};
        System.out.println(findNumbers(nums));
        
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
        if(evencheck(i)){
            count++;
        }
        }
        return count;}
    public static boolean evencheck(int num){
        String num_str = Integer.toString(num);
        int digits= num_str.length();
        return digits%2==0;
    }
}
