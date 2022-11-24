package leetcode;

class Solution {
    public static void main(String[] args) {
        
    }
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if(target==nums[pivot]){
            return pivot;
        }
        int left = binarysearch(nums,target,0,pivot-1);
        int right= binarysearch(nums,target,pivot+1,nums.length-1);
        if(left==-1&&right==-1){
            return -1;
        }
        if(left!=-1)return left;
        return right;
    }
    public int binarysearch(int[] nums, int target,int start,int end){
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
            
        }return -1;
    }
    public int pivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        int mid;
        while(start<end){
            mid = start + (end-start)/2;
            if(nums[start]<nums[mid]){
                start = mid;
            }
            else {
                end = mid;
            }
           
            
        }return start;
    }
}