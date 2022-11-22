package binary_search;

public class InfinteArray {
    public static void main(String[] args) {
        int start=0;
        int end=1;
        int[] arr= {1,2,3,4,5,6,67,70,71,75,78,80,90,100,120,150,170,180,200,220};
        int target=180;
        while(target>arr[end]){
            int temp = end+1;
            end= end + (end-start+1)*2;
            start = temp; 
        }
        System.out.println(binarysearch(arr, target, start, end));

    }
    static int binarysearch(int[] arr, int target,int start,int end){
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
