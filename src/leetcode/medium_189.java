package leetcode;
class Solution {
    public void rotate(int[] nums, int k) {
        if(k%nums.length!=0){
        k = k%nums.length;
        int[] rot= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i>=k){
                 rot[i]=nums[i-k];
            }else{
            rot[i]=nums[nums.length-(k-i)];}
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=rot[i];
        }}
        
    }
}