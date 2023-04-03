package leetcode;
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] ans =new int[nums.length];
        for(int i=0;i<ans.length;i++){
            if(leftsum(nums,i)-rightsum(nums,i+1)<0){
                ans[i]=(leftsum(nums,i)-rightsum(nums,i+1))*-1;
            }else{
                 ans[i]=leftsum(nums,i)-rightsum(nums,i+1);
            }
        }
        return ans;
    }

    int leftsum(int[] nums,int i){
        int Lans=0;
        if(i==0){
            return 0;
        }
        for(int n=0;n<i;n++){
            Lans = Lans+nums[n];
        }
        
        return Lans;
    }
    int rightsum(int[] nums,int i){
        int Rans=0;
        if(i>=nums.length){
            return 0;
        }
        for(int n=i;n<nums.length;n++){
            Rans = Rans+nums[n];
        }
       
        return Rans;
    }
}