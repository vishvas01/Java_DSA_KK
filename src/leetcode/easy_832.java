package leetcode;

public class easy_832 {
    public static void main(String[] args) {
        
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            for(int i=0;i<(image.length+1)/2;i++){
                int temp = row[i]^1;
                row[i]= row[image.length-i-1]^1;
                row[image.length-i-1]=temp;
            }
        }
        return image;
    }
}
