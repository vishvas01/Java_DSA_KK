package leetcode;

public class easy_645 {
    public int[] findErrorNums(int[] arr) {
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
        int[] ans= {0,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans[0]=arr[i];
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
