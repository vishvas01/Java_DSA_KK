package leetcode;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        // String ans="";
        // int i=0,j=0;
        // while(i<word1.length()&&j<word2.length()){
        //     ans=ans+""+word1.charAt(i++);
        //     ans=ans+""+word2.charAt(j++);
        // }
        // if(i<word1.length()){
        //     for(int a=i;a<word1.length();a++){
        //         ans=ans+""+word1.charAt(a);
        //     }
        // }
        // if(j<word2.length()){
        //     for(int a=j;a<word2.length();a++){
        //         ans=ans+""+word2.charAt(a);
        //     }
        // }
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        ans.append(word1.substring(i));
        ans.append(word2.substring(j));

        return ans.toString();
    }
}