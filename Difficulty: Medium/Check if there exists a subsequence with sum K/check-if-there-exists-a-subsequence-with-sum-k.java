// User function Template for Java

class Solution {
    public static boolean get(int n  ,  int[] arr , int k , int i ,  Boolean[][] dp){
        if(k == 0)return true ;
        if(k < 0 || i >= n)return false;
        if(dp[k][i] != null) return dp[k][i];
        
        boolean add = get(n , arr , k-arr[i] , i+1, dp); 
        boolean not =   get(n , arr , k , i+1, dp); 
        return dp[k][i] = add || not;
        
        
    }
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        Boolean[][] dp =  new Boolean [K+1][N+1];
        
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        if(sum < K)return false;
        return get(N ,  arr , K , 0 , dp);
    }
}
