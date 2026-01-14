class Solution {
    public void getdfs(ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> ll ,boolean[] visited, int i ){
        if(visited[i])return;
        
        ll.add(i);
        visited[i] = true;
        
        for(int j = 0 ; j < adj.get(i).size(); j++){
            int nbrs =  adj.get(i).get(j);
            if(!visited[nbrs]){
                getdfs(adj ,  ll , visited , nbrs);
            }
        }
        
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        ArrayList<Integer> ll = new ArrayList<Integer>();
        boolean[] visited =  new boolean[n];
        for(int i = 0 ; i < n ; i++ ){
           getdfs(adj , ll ,  visited ,  i); 
        }
        
        return ll;
        
    }
}