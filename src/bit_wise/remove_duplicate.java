package bit_wise;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,3,2};
        int unique =0;
        for(int i: arr){
            unique = unique ^ i;
        }
        System.out.println(unique);
    }
}
