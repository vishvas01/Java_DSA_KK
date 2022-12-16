package cycle_sort;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,1,4,6};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            while((i+1)!=arr[i]){
                int temp =arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
