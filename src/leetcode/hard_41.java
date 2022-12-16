package leetcode;

import java.util.Arrays;

public class hard_41 {
    public static void main(String[] args) {
        int[] arr={7,8,9,11,12,-1,0};
        System.out.println(firstMissingPositive(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0&&(i+1)!=arr[i]&&arr[i]<=arr.length){
                if(arr[arr[i]-1] == arr[i]){
                    break;
                }
                int temp =arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }

        return arr.length+1;
    }
}
