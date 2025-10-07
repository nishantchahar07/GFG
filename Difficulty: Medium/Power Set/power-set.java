// User function Template for Java

class Solution {
    public static void power(int i , String s , String ans , List<String> ll){
       
       if(i ==  s.length()){
           ll.add(ans);
           return;
       } 
        power(i+1 , s , ans , ll);
        char ch =  s.charAt(i);
        power(i+1 , s , ans+ch , ll);
    }
    public List<String> AllPossibleStrings(String s) {
        List<String> ll =  new ArrayList<>();
        power(0 , s , "", ll);
        Collections.sort(ll);
        return ll;
        
        
      
    }
}