// User function Template for Java
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) {
     HashMap<Integer , ArrayList<Integer>> map =  new HashMap<>();
             if (m != n - 1) return false;

     for(int i = 0 ; i < n ; i++){
         map.put(i ,  new ArrayList<>());
     }
     for(int i = 0 ; i < m ; i++){
         int a = edges.get(i).get(0);
         int b = edges.get(i).get(1);
         
         map.get(a).add(b);
          map.get(b).add(a);
     }
     
     return bfs(map);
        
    }
    public boolean bfs( HashMap<Integer , ArrayList<Integer>> map ){
       int count = 0;
        Queue<Integer> q =  new LinkedList<>();
        HashSet<Integer> set =  new HashSet<>();
        for(int i : map.keySet()){
            if(set.contains(i)) continue;
            count++;
            q.add(i);
        
        while(!q.isEmpty()){
            int val =  q.poll();
            if(set.contains(val))return false;
             set.add(val);
            for(int nbrs : map.get(val)){
                if(!set.contains(nbrs)){
                   
                    q.add(nbrs);
                    
                }
            }
        }
        
    }
    return count == 1;
    }
}
