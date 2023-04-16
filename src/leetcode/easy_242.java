package leetcode;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        String a = new String(S);
        String b = new String(T);
        return a.equals(b);
    }
}