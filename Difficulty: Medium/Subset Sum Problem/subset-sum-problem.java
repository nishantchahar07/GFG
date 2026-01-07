class Solution {
    public static boolean get(int[] arr , int sum , int n , Boolean[][] dp ){
        if(sum == 0)return true;
        if(n ==  0 && sum > 0)return false;
        if(dp[n][sum] != null){
            return dp[n][sum];
        }
        int val =  arr[n-1];
        if(val > sum) {
            return dp[n][sum] = get(arr, sum , n-1,dp);
        }
        else{
            boolean add = get(arr, sum-val , n-1,dp);
            boolean not = get(arr, sum , n-1,dp);
            return dp[n][sum] = add || not;
        }
       
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        
        int n =  arr.length;
        int ans = 0;
        for(int i  : arr){
            ans+=i;
        }
        if(ans < sum)return false;
        Boolean[][] dp =  new Boolean[arr.length+1][sum+1];

      return get(arr , sum , n, dp);
        
    }
}