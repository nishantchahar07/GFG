class Solution {
    public void get( ArrayList<ArrayList<Integer>> ll ,Stack<Integer> st ,  boolean[] visited , int node ){
        visited[node] = true;
       
        
        for(int nbrs : ll.get(node)){
            if(!visited[nbrs]){
                get(ll, st , visited , nbrs);
            }
        }
        st.push(node);
        }
        
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
       // directed acyclic graph 
       ArrayList<ArrayList<Integer>> ll  = new ArrayList<>();
      Stack<Integer> st = new Stack<>();
       boolean[] visited  =  new boolean[V];
       for(int i = 0 ; i < V ; i++){
           ll.add(new ArrayList<>());
       }
       for(int i = 0 ; i < edges.length ; i++){
           int a   =  edges[i][0];
           int b  =  edges[i][1];
           
           ll.get(a).add(b);
           
       }
       
       for(int i = 0 ; i < ll.size() ; i++){
           if(!visited[i]){
               get(ll, st , visited , i);
           }
       }
        ArrayList<Integer> ans =  new ArrayList<Integer>();
       while(!st.isEmpty()){
          ans.add(st.pop()); 
       }
       return ans;
    }
}