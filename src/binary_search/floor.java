package binary_search;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,10,24,30,35};
        System.out.println(floor_search(arr, 24));      
        System.out.println(floor_search(arr, 8)); 
    }

    static int floor_search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid;
        if(target<arr[0]){
            return -1;
        }
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        return arr[end];
    }
    
}
