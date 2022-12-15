package selection_sort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {3,7,20,8,16,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-1-i;
            int maxIndex = maximumIndex(arr, 0, last);
            int temp = arr[maxIndex];
            arr[maxIndex]= arr[last];
            arr[last]= temp;
        }

    }

    static int maximumIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
