package leetcode;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        for(char i:j){
            for(char a:s){
                if(i==a){
                    count++;
                }
            }
        }
        return count;
    }
}
