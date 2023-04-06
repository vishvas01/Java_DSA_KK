package advance_java;

class hajmola {
    public static void main(String[] args) {
        int[] arr = {1,2,12,13,14,15,17};
        System.out.println(bin(arr,0,arr.length-1,13));
    }

    static int bin(int[] arr,int s,int e,int target){
        if(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                return bin(arr, mid+1, e, target);
            }else{
                return bin(arr, s, mid-1, target);
            }
        }
        return -1;
    }
}
