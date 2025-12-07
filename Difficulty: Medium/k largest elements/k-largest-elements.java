class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
       Arrays.sort(arr);
       ArrayList<Integer> ll =  new ArrayList<>();
       for(int i = arr.length-1 ; i >= arr.length-k ; i--){
           ll.add(arr[i]);
       }
         return ll;
    }
}
