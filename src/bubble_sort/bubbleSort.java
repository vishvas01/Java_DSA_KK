package bubble_sort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr= {2,5,17,4,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubblesort(int[] arr){
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped= true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}