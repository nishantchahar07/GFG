class Solution {
    public static boolean get(int[] arr ,  int sum , int n , Boolean [][]dp){
        
      
        if(dp[n][sum] != null)return dp[n][sum];
        if(sum == 0)return true;
           if(n == 0)return false;
    
        if(arr[n-1] <= sum){
            
            Boolean add = get(arr , sum-arr[n-1] , n-1 , dp);
             Boolean not = get(arr , sum , n-1 , dp);
            return dp[n][sum] = add || not;
        }
        else{
           return dp[n][sum] = get(arr , sum , n-1 , dp);
        }
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        Boolean [][]dp =  new Boolean[n+1][sum+1];
        return get(arr , sum , n , dp);
        
    }
}