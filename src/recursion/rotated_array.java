package recursion;

public class rotated_array {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rsa(arr, 2, 0, arr.length-1));
    }

    static int rsa(int[] arr,int target, int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s]&&target<=arr[mid]){
               return rsa(arr, target, s, mid-1);
            }
            else{
               return rsa(arr, target, mid+1, e);
            }}
        else{
            if(target>=arr[mid]&&target<=arr[e]){
                return rsa(arr, target, mid+1, e);
            }
            else{
               return rsa(arr, target, s, mid-1);
            }
        }
            
    }
}
