package leetcode;
// 
class Solution {
    public static void main(String[] args) {
        
    }
    public int reverse(int x) {
        boolean flag= false;
        if(x<0){
            flag = true;
            x=x*-1;
        }
        long rev=0;
        while(x>0){
            rev = rev*10+x%10;
            x/=10;
        }
        if (rev>Integer.MAX_VALUE){
            return 0;
        }
        if(flag)return (int)rev*-1;
        return (int)rev;
        // String[] rev={};
        // if(x.charAt(0)=='-'){
        //     rev[0]='-';
        //     for(int i=x.length()-1;i>=1;i--){
        //         rev[x.length()-i]= x.charAt(i);
        //     }
        // }else{
        //     for(int i=x.length()-1;i>=1;i--){
        //         rev[x.length()-1-i]= x.charAt(i);
        //     }
        // }
        // return rev;
    }
}