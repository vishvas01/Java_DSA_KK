package leetcode;

public class easy_35 {
    public static void main(String[] args) {
        
    }
    
     public int searchInsert(int[] nums, int target) {
         for(int i = 0; i < nums.length; i++)
            if(nums[i] == target) return i;
            else if(nums[i] > target) return i;
           
           return nums.length;
     }
    // public int searchInsert(int[] arr, int target) {
    //     for(int i=0;i<arr.length;i++){
    //         while((i)!=arr[i]&&arr[i]<arr.length){
    //             int temp =arr[arr[i]];
    //             arr[arr[i]] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=i){
    //             return i;
    //         }
    //     }

    //     return arr.length;
    // }
    }
