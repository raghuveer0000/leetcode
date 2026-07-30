class Solution {
    public int maxProfit(int[] prices) {
       int min=Integer.MAX_VALUE;
       int maxprofit=0;
       for(int p:prices){
        if(p<min){
            min=p;
        }
        else{
            maxprofit=Math.max(maxprofit,p-min);
        }
       } 
       return maxprofit;
    }
}