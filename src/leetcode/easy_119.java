// public class easy_119 {
//     public static void main(String[] args) {
//         System.out.println(Arrays.toString(getRow(3)));
//     }

//     public static int[] getRow(int rowIndex) {
//         int s=1;
//         if(rowIndex==0){
//             int[] res = {1};
//             return res;
//         }
//         int[] ans = new int[rowIndex+1];
//         ans[0]=1;
//         ans[rowIndex]=1;
//         for(int i=1;i<rowIndex;i++){
//             s = s * (rowIndex-i+1)/i;
//             ans[i] = s;
//         }
//         return ans;
//     }
// }

class Solution {
    public List<Integer> getRow(int rowIndex) {
          int s = 1;
        if (rowIndex == 0) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(1);
            return res;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(1);
        
        for (int i = 1; i < rowIndex; i++) {
            s = s * (rowIndex - i + 1) / i;
            ans.add(i, s);
        }
        
        return ans;
    }
}