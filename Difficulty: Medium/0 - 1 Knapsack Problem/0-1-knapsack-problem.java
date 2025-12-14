class Solution {
    public int get(int w , int[] val , int[] wt , int n , int[][]dp){
        
        if(n == 0 || w == 0)return 0;
        if(dp[n-1][w] != -1)return dp[n-1][w] ;
        int weight =  wt[n-1];
        if(w >= weight){
       return dp[n-1][w] =  Math.max( val[n-1] + get(w-weight ,  val , wt , n-1 , dp), get(w  ,  val , wt , n-1 , dp)); 
    }
    else{
       return  get(w  ,  val , wt , n-1 , dp);
    }
    }
    
    
    
    public int knapsack(int W, int val[], int wt[] ) {
        int n = wt.length;
        int[][]dp =  new int[n+1][W+1];
        for(int[] i : dp){
            Arrays.fill(i , -1);
        }
    return  get(W , val , wt , n , dp);
        
    }
}
