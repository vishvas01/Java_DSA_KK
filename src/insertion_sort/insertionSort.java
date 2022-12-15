package insertion_sort;

import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,20,15,3,1};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            int j =i+1;
            while(j>0){
                if(arr[j]>arr[j-1]){
                    break;
                }
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j]= temp;
                }
                j--;
            }
        }
    }
}
