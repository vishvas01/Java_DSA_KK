package leetcode;
//https://leetcode.com/problems/missing-number/
public class easy_268 {
    public int missingNumber(int[] arr) {
        for(int i=0;i<arr.length;i++){
            while((i)!=arr[i]&&arr[i]<arr.length){
                int temp =arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }

        return arr.length;
    }
}

