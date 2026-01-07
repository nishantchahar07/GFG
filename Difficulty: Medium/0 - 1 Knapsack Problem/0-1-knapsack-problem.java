class Solution {
    public int get(int W, int val[], int wt[] , int n , int[][]dp){
        if(n == 0 || W == 0)return 0;
        if(dp[W][n] != -1)return dp[W][n];
        
        int value =  wt[n-1];
        if(value <= W){
            int add = val[n-1] + get(W-value ,  val ,  wt , n-1 , dp);
            int not =  get(W ,  val ,  wt , n-1 , dp); 
            return dp[W][n] = Math.max(add , not);
        }
        else{
            return dp[W][n] = get(W ,  val,  wt , n-1 , dp);
        }
    }
    public int knapsack(int W, int val[], int wt[]) {
      int[][] dp =  new int[W+1][wt.length+1];
      for(int i = 0 ; i < dp.length ; i++){
       Arrays.fill(dp[i] , -1);
      }
        int n =  wt.length;
      return  get(W ,  val ,  wt , n , dp); 
    }
}
