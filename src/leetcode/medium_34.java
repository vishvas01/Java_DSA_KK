package leetcode;

public class medium_34 {
    public static void main(String[] args) {
        
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]= binarysearch(nums, target, true);
        ans[1]= binarysearch(nums, target, false);
        return ans;
    }

    static int binarysearch(int[] arr, int target, boolean findingstartindex){
        int ans =-1;
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target){
                if(findingstartindex){
                    end = mid -1;
                    ans = end;
                }else{
                    start = mid +1;
                    ans = mid;
                }
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}
