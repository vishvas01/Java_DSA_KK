package binary_search;
// arr = {15,18,2,3,6,12}
public class rotatedArrayCount {
    public static void main(String[] args) {
        int[] arr =  {12,15,18,2,3,6};
        System.out.println(pivot(arr)+1);
    }
    public static int pivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        int mid;
        while(start<end){
            mid = start + (end-start)/2;
            if(nums[start]<nums[mid]){
                start = mid;
            }
            else {
                end = mid;
            }
           
            
        }return start;
    }
}
