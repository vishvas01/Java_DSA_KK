package firstjavaprogram_ep8;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class assignment_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number 1:");
        int n1 = scan.nextInt();
        System.out.print("enter number 2:");
        int n2 = scan.nextInt();
        for(int i=n1+1;i<n2;i++){
            float digit = 0;
            float sum = 0;
            int number = i;

            while(number>0){
                number = number/10;
                digit++;
            }
            
            number = i;

            while(number>0){
                float rem =0;
                rem = number%10;
                sum = (float) (sum + Math.pow(rem, digit));
                number= number/10;
            }
            if(sum==i){System.out.println(i);}

        }
        scan.close();
    }
}
