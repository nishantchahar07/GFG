class Solution {
    public static boolean isvalid(int[] arr , int mid , int k){
        int count =1;
        int page = 0;
        int i = 0;
        while(i<arr.length){
            if(page+arr[i] <= mid){
                page+=arr[i];
                i++;
            }
            else{
                page = 0;
                count++;
            }
            if(count > k){
                return false;
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        int lo = 0;
        int hi = 0;
        for(int i : arr){
            hi+=i;
        }
        if(arr.length < k){
            return -1;
        }
        int ans  = -1;
        while(lo <=  hi){
            int mid = lo + (hi-lo)/2;
            if(isvalid(arr , mid , k)){
                ans = mid;
                hi  = mid -1;
            }
            else{
                lo =  mid +1;
            }
        }
        return ans;
    }
}