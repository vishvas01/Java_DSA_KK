package leetcode;

public class medium_852 {
    public static void main(String[] args) {
        int[] arr = {0,1,4,3,1};
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    public static int peakIndexInMountainArray(int[] arr) {
     
     return binarysearch(arr); 
    }
    static int binarysearch(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<end){
            mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
