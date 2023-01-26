package recursion;

import java.util.Arrays;

class bubble {
    public static void main(String[] args) {
        int[] arr = {2,6,4,3,1,5};
        sort(arr,arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int r,int c){
        if(r==0){
            return;
        }
        if(c<r-1){
            if(arr[c]>arr[c+1]){
                int temp = arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=temp;
            }
            sort(arr,r, c+1);
        }else{
            sort(arr,r-1, 0);
        }
    }}
