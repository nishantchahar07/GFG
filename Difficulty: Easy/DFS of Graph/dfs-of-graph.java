class Solution {
    public void  getdfs(boolean[] visited  ,  ArrayList<Integer> list ,ArrayList<ArrayList<Integer>> adj ,  int src){
        visited[src] =  true;
        list.add(src);
        
        for(Integer x : adj.get(src)){
            if(!visited[x]){
                getdfs(visited , list ,adj ,  x);
            }
        }
        
        
        
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
   
       boolean[] visited  =  new boolean[adj.size()];
        ArrayList<Integer> list = new ArrayList<>();
        
        getdfs(visited , list ,adj ,  0);
        return list;
    }
}