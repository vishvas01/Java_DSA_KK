package advance_java;

import java.util.Arrays;

class hajmola {
    public static void main(String[] args) {
        int[] arr = {1,2,12,13,14,15,17};
        int[] sort = {4,14,2,3,1,5,10,9};
        sort(sort);
        System.out.println(Arrays.toString(sort));
      //  System.out.println(bin(arr,0,arr.length-1,13));

        String s = "hello";
        StringBuilder srev = new StringBuilder(s);
        srev.reverse();
        System.out.println(srev);
    }

    static void sort(int[] sort){
        boolean swapped= false;
        for(int i=0;i<sort.length-1;i++){
            for(int j=1;j<sort.length-i;j++){
                if(sort[j]<sort[j-1]){
                    int temp = sort[j];
                    sort[j]=sort[j-1];
                    sort[j-1]=temp;
                    swapped =true;
                } 
            }
            if(!swapped){
                break;
            }
        }
    }

    
    static int bin(int[] arr,int s,int e,int target){
        if(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                return bin(arr, mid+1, e, target);
            }else{
                return bin(arr, s, mid-1, target);
            }
        }
        return -1;
    }
}
