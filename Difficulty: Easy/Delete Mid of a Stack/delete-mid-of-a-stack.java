class Solution {

    public void delete(Stack<Integer> s ,  double mid){
        if(s.size() == mid){
            s.pop();
            return;
        }
    int val =     s.pop();
    delete(s , mid);
    s.push(val);
        
    }
    public void deleteMid(Stack<Integer> s) {
        int size =  s.size();
        double mid =  Math.floor((size+1)/2);
        delete(s, mid);
        
    }
}