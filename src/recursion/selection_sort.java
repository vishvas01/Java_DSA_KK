package recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,6,4,3,1,5};
        sort(arr,arr.length-1, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] arr, int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                sort(arr, r, c+1, c);
            }else{
                sort(arr,r, c+1,max);
            } 
        }else{
            int temp = arr [r];
            arr[r] = arr[max];
            arr[max]= temp;
            sort(arr,r-1, 0,0);
        }
}}
