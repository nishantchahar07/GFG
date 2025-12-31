class Solution {
    public void getdfs(ArrayList<ArrayList<Integer>> adj ,boolean []visited  , 
    ArrayList<Integer> list , int s){
        
        visited[s] = true;
        list.add(s);
        
        for(int i : adj.get(s)){
            if(!visited[i]){
                visited[i] = true;
                getdfs(adj , visited  , list  ,  i);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
          int size  =  adj.size();
          boolean []visited  = new boolean[size];
          ArrayList<Integer> list =  new ArrayList<>();
         getdfs(adj , visited  , list , 0 );
         return list;
    }
}