class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ans.add(getRow(i));
        }
        return ans;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1); // First element is always 1
        for (int i = 1; i <= rowIndex; i++) {
            long curr = (long) ans.get(i - 1) * (rowIndex - i + 1) / i;
            ans.add((int) curr);
        }
        return ans;
        // long s = 1;
        // if (rowIndex == 0) {
        //     ArrayList<Integer> res = new ArrayList<>();
        //     res.add(1);
        //     return res;
        // }
        
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(1);
        // ans.add(1);
        
        // for (long i = 1; i <= rowIndex; i++) {
        //     s = s * (rowIndex - i + 1) / i;
        //     ans.add(i, s);
        // }
        // return ans;
       
    }
}