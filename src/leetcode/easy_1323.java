package leetcode;

class Solution {
    public int maximum69Number (int num) {
        String number = String.valueOf(num);
        StringBuilder string = new StringBuilder(number);
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)!='9'){
                string.setCharAt(i,'9');
                break;
            }
        }
        number = string.toString();
        return Integer.parseInt(number);
    }
}