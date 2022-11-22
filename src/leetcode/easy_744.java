package leetcode;

public class easy_744 {
    public static void main(String[] args) {
        
       
    }

    static int smallest_letter(char[] letter, int target){
        int start=0;
        int end=letter.length-1;
        int mid;
    
        while(start<=end){
            mid = start + (end-start)/2;
            if(letter[mid]==target){
                return letter[mid];
            }
            else if(letter[mid]>target){
                end = mid -1;
            }
            else {
                start = mid+1;
            }
        }
        return letter[start%(letter.length)];
    }
}
