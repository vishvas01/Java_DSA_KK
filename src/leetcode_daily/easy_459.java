package leetcode_daily;

public class easy_459 {
    
}
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }
}