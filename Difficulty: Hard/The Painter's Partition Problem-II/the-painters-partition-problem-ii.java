class Solution {
    public static boolean isvalid(int[] arr , int mid , int k){
        int ans = 1; 
        int count  = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(count + arr[i] > mid){
                ans++; 
                count = arr[i]; 
            }
            else{
                count += arr[i];
            }
            if(ans > k) return false;
        }
        return true;
    }

    public int minTime(int[] arr, int k) {
       int st = Arrays.stream(arr).max().getAsInt(); 
       int end = Arrays.stream(arr).sum(); 
       int ans = 0;

       while(st <= end){
           int mid = st + (end - st)/2;
           if(isvalid(arr, mid, k)){
               ans = mid;
               end = mid - 1; 
           }
           else st = mid + 1;
       }
       return ans;
    }
}
