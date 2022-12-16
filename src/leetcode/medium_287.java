package leetcode;
// https://leetcode.com/problems/find-the-duplicate-number/
public class medium_287 {
    public int findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            while((i+1)!=arr[i]){
                if(arr[arr[i]-1] == arr[i]){
                    break;
                }
                int temp =arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return arr[i];
            }
        }
        return -1;
    }
    
}
