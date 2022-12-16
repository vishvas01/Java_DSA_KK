package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class easy_268 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,0};
       System.out.println(missingNumber(arr));
    //    System.out.println(Arrays.toString(arr));
    }
    static int missingNumber(int[] arr) {
        for(int i=0;i<arr.length;i++){
            while((i)!=arr[i]&&arr[i]<arr.length){
                int temp =arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }

        return arr.length;
    }
}

