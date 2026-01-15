class Solution {
    public boolean get(ArrayList<ArrayList<Integer>> ll , int node ,int parent , boolean visited[] ){
        visited[node] = true;
        
        for(int nbrs : ll.get(node)){
          if(!visited[nbrs]){
              if(get(ll , nbrs , node,  visited)){
                    return true ;
                }
          }
          else if(parent != nbrs )return true;
       
        
    }
     return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> ll =  new ArrayList<>();
        boolean visited[] =  new boolean[V];
        for(int i = 0 ; i < V ; i++){
            ll.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i < edges.length ; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            
    ll.get(a).add(b);
    ll.get(b).add(a);
        }
        
        for(int i = 0 ; i < ll.size() ; i++){
            if(!visited[i]){
                if(get(ll , i ,-1,  visited)){
                    return true ;
                }
            }
        }
        return false;
        
    }
}