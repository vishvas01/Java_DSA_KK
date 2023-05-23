package cdc;
import java.util.*;

class first{
    public static void main(String Args[]){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int d1=0,d2=0,ans=0,f=1,odd=0,k=0;
        int digit = (int)(Math.log10(n)+1);
        if(digit%2!=0){
            odd = n%10;
            n = n/10;
            k=1;}
        while(n!=0){
            d1 = n%10;
            d2 = ((n-d1)/10)%10;
            ans += f*(10*d1+d2);
            n = (n/100);
            f *=100;
        }
        //cdc didnt provide proper hehehe
        if(k==1){
            ans = ans*10+odd;
        }
        System.out.println(ans);
    }
}