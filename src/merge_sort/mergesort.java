package merge_sort;
import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr= {3,7,2,1,6,13,15};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

     static int[] merge(int[] left, int[] right) {
        int i=0,j=0,k=0;
        int[] mix = new int[left.length+right.length];
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                mix[k]= left[i];
                i++;
                k++;
            }else{
                mix[k]= right[j];
                j++;
                k++;
            }
        }

        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }
}
