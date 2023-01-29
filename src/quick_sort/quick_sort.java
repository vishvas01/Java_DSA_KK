package quick_sort;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,8,6,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int low, int hi){
        if(low>=hi){
            return ;
        }
        int s = low;
        int e = hi;
        int pivot = s + (e-s)/2;
        while(s<=e){
            while(arr[s]<arr[pivot]){
                s++;
            }
            while(arr[e]>arr[pivot]){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, hi);
    }
}
