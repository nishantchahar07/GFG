class Solution {
    public void bubbleSort(int[] arr) {
     //bubble
     int n  = arr.length;
     for(int i = 0 ; i <  n ; i++){
         for(int j = i ; j < n ; j++){
             if(arr[i] > arr[j]){
                 int tem = arr[i];
                 arr[i] = arr[j];
                 arr[j] =  tem;
             }
         }
     }
     
     
     //Selection Sort
     //Insertion Sort
     
        
    }
}