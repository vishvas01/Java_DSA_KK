public class medium_799 {
    
}
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) 
    {
        double glass[][] = new double[102][101];
        glass[0][0] = poured;
        for(int i = 0; i <= query_row;i++)
            for(int j = 0; j <= i;j++)
            {
                // If a Glass is overflows
                if(glass[i][j] > 1.0)
                {
                     // Get the overflow quantity
                     double rem = glass[i][j] - 1;
                     glass[i][j] = 1;
                     // And divide it equally between the two glasses below

                     glass[i+1][j] += rem / 2;
                     glass[i+1][j+1] += rem /2;
                }
            }
            /*
        // To check what glass hold what quantity
    for(int i = 0; i < 101;i++){  for(int j = 0; j <= i;j++) cout << glass[i][j] << ' '; cout << '\n'; }
        */
        return glass[query_row][query_glass];
    }
}