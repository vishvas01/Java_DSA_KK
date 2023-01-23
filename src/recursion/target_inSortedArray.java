package recursion;

public class target_inSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,14,15,16};
        System.out.println(check(arr, 7, 0));
    }
    static boolean check(int[] arr,int target, int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index]==target || check(arr, target, index+1);
    }
}
