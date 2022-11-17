package leetcode;

public class easy_9 {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        while(x>0){
            rev =  x%10 + rev*10 ;
            x = x/10;
        }  
       return org == rev?true:false;
        
    }
}

// class Solution {
//     public boolean isPalindrome(int x) {
//         StringBuilder sb=new StringBuilder(); 
//         // if(x<0){
//         //     return false;
//         // }
//         sb.append(x);
//         String rev = sb.toString();
//         if(sb.reverse().toString().equals(rev)){
//         return true;
//         }
//         else{
//             return false;
//         }

        
//     }
// }