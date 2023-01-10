package leetcode;

public class easy_69 {
    public int mySqrt(int x) {
        int s = 1;
        int e = x;

        while(s <= e){
            int mid =s+ (e-s) / 2;

            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return e;
    }
}
