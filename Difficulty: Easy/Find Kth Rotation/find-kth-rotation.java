class Solution {
    public int findKRotation(int arr[]) {
        int st  = 0;
        int end = arr.length-1;
        int ans = 0;
        while(st < end){
            int mid = st + (end-st)/2;
           if(arr[mid] >  arr[end]){
               st =  mid + 1; 
           }
           else{
               end  = mid;
           }
        }
    return end ;
    }
}