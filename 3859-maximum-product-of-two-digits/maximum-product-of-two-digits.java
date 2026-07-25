import java.util.*;

class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n>0){
           int r=n%10;
           list.add(r);
           n=n/10;
        }
        Collections.sort(list);
        int l=list.size();
        int result=list.get(l-1)*list.get(l-2);
        return(result);
    }
    
}