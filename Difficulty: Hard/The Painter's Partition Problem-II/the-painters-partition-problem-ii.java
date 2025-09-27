class Solution {
    public static boolean isvalid(int[] arr , int mid  , int k){
        int count = 1;
        int val =  0;
        int i = 0;
        while(i < arr.length){
            if(val+arr[i] > mid ){
                count++;
                val = arr[i];
            }
            else {
                val+=arr[i];
            }
            i++;
            if(count > k)return false;
            
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
       int lo =  0;
       int hi  = 0;
       for(int i : arr){
           hi+=i;
           lo = Math.max(lo,i);
       }
       int  ans = -1;
       while(lo <=  hi){
           
           int mid =  lo + (hi-lo)/2;
           if(isvalid(arr, mid , k)){
               ans =  mid;
               hi =  mid-1;
               
           }
           else{
            lo = mid+1;   
           }
       }
       return ans;
    }
}
