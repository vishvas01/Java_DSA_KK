package leetcode;

import java.util.Arrays;

public class easy_217 {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }
    
        public static boolean containsDuplicate(int[] nums) {
         if(nums.length == 0 || nums.length == 1){
             return false;
         }
         Arrays.sort(nums);
         int prev = Integer.MIN_VALUE;
         
         for(int x : nums){
             if(x!=prev){
                 prev =x;
             }
             else{
                 return true;
             }
         }
         return false;
     }
     
    // public static boolean containsDuplicate(int[] arr) {
    //     for(int i=0;i<arr.length;i++){
    //         while((i+1)!=arr[i]){
    //             if(arr[arr[i]-1] == arr[i]){
    //                 break;
    //             }
    //             int temp =arr[arr[i]-1];
    //             arr[arr[i]-1] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=i+1){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
