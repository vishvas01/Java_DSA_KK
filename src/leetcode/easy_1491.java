package leetcode;
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        salary[0]=salary[salary.length-1]=0;
        for(int val:salary){
            sum =sum+val;
        }
        return sum/(salary.length-2);
        }
}