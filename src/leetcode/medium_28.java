package leetcode;

class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=0,flag=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                flag=i;
                while(haystack.charAt(i)==needle.charAt(j)){
                    i++;
                    j++;
                    if(j==needle.length()){
                        break;
                    }if(i==haystack.length()){
                        return -1;
                    }
                }
                if(j==needle.length()){
                    return flag;
                }else{
                    j=0;
                    i= flag+1;
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}