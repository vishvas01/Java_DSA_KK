package leetcode;
// class Solution {
//     public boolean checkPerfectNumber(int num) {
//         return help(num-1,0,num);
//     }
//     boolean help(int n,int sum,int num){
//         if(num==1){
//             return false;
//         }
//         if(num==28){
//             return true;
//         }
//         if(n*n<=num){
//             if(num==(sum+1)){
//                 return true;
//             }else{
//                 return false;
//             }
//         }
//         if(num%n==0){
//             sum = sum+n;
//         }
//         return help(n-1,sum,num);
//     }
// }
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        if(num==1) {
            return false;
        }
        for(int i=2; i*i<=num; i++) {
            if(num%i==0) {
                sum += i + num/i;
            }
        }
        if(sum==num) {
            return true;
        }
        return false;
    }
}