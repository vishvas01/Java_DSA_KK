package recursion;
//using recursion
public class binary_search {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6,9,20,29};
        System.out.println(binarysearch(arr, 9, 0, arr.length-1));
    }

    static int binarysearch(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(target== arr[m]){
            return m;
        }

        if(target < arr[m]){
            return binarysearch(arr,target,s,m-1);
        }
        return binarysearch(arr, target,m+1,e);
    }
}
