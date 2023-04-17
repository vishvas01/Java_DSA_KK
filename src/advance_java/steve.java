package advance_java;

import java.util.Scanner;

public class steve {
    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     float n = s.nextFloat();
    //     boolean flag = false;
    //     if(n<0){
    //         n=n*-1;
    //         flag = true;
    //     }
    //     float withoutd= n - n%1;
    //     float decimal = n%1;
    //     float sum=0;
    //     while(withoutd>0){
    //         sum = sum+withoutd%10;
    //         withoutd = withoutd/10;
    //     }
    //     while(decimal%1!=0){
    //         sum = sum + decimal*10;
    //         decimal=(decimal*10)%1;
    //     }
    //     if(flag){
    //         sum = sum*-1;
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //     int[] ar={7,4,8,2,9};
    //     int[] ar1={3,4,5,8,9};
    //     int[] ar2={3,4,5,9,9};
    //     h(ar);
    //     h(ar1);
    //     h(ar2);


    // }
    // static void h(int[] ar){
    //     int count=1;
    //     for(int i=1;i<ar.length;i++){
    //         for(int j=i-1;j>=0;j--){
    //             if(ar[i]<=ar[j]){
    //                 break;
    //             }
    //             if(j==0){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }
    //given an integer array of size n the task is to find count of elements whose value is greater than all its prior elements
//n=5
//arr=7,4,8,2,9
//n=5 arr=3,4,5,8,9 out 5
//n=5 3,4,5,9,9

    public static void main(String[] args) {
        int cap=10;
        int k=5;
        Scanner s=new Scanner(System.in);
        int in=s.nextInt();
        if(in>10||in==0){
            System.out.println("invalid input"+" available "+cap);
        }else{
        System.out.println("sold "+in+" available "+(cap-in));}
    }
    //jar full of candies for sale in mall counter jar has capacity n , at any point of time jar can have 
    // m number of candies. they are served to customers. jar never empty
    //left candies are k
    //refilled when k remains to full
    //show 
    //n=10,k<5;input=3||sold=3,av=7;
    //n=10,k<=5,input=0||invalid input and av=10;
}

 