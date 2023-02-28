package leetcode;

public class easy_2520 {
    public static void main(String[] args) {
        
    }

    public static int countDigits(int num) {
        int count=0;
        int n=num;
        while(num>0){
            if(n%(num%10)==0){
                count++;
                num=num/10;
            }else{
                num=num/10;
            }
        }
        return count;
    }
}
