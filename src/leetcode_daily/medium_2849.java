public class medium_2849 {
    
}
public class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx == fx && sy == fy) {
            return t != 1;
        }
        return Math.max(Math.abs(sx - fx), Math.abs(sy - fy)) <= t;
    }
}