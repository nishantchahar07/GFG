class Solution {
    int lowerBound(int[] arr, int target) {
        
        int st = 0;
        int end  = arr.length-1;
        int ans = arr.length;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] >= target){
                ans = mid;
                 end =  mid-1;
              
            }
            else{
                 st= mid+1;
            }
        }
        return ans;
    }
}
