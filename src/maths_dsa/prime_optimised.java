package maths_dsa;

public class prime_optimised {
    public static void main(String[] args) {
        int n =40;
        boolean[] composite = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!composite[i]){
                for(int j=i*2;j<n;j=j+i){
                    composite[j]= true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!composite[i]){
                System.out.println(i+" is prime");
            }
        }
    }
   
}