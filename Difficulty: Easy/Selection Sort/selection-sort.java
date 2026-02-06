class Solution {
    void selectionSort(int[] arr) {
    
       
        int minIdx = 0;
        for(int i = 0 ; i < arr.length  ; i++){
             int min =  Integer.MAX_VALUE;
            for(int j = i ;  j < arr.length ; j++){
                if(arr[j] < min){
                    min =  arr[j];
                    minIdx =  j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] =  temp;
        }
        
    }
}