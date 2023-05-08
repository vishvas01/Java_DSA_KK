package leetcode_daily;
class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            if(i==mat.length-1-i){
                ans=ans+mat[i][i];
            }else{
                ans=ans+mat[i][i]+mat[i][mat.length-1-i];
            }
            
        }
        return ans;
    }
}