package leetcode;

public class easy_69 {
    public int mySqrt(int x) {
        int ans=0;
        int start=1;
        int end=x;
        while(start<end){
            int mid = (start + end)/2;
            if(mid*mid == x){
                return mid;
            }
            if(mid*mid > x){
                end = mid;
                ans=mid;
            }
            if(mid*mid <x){
                start = mid;
                ans=mid;
            }
        }
        return ans;
    }
}
