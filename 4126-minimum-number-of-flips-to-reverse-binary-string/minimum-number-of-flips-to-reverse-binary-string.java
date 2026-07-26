class Solution {
    public int minimumFlips(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n>0){
            int r=n%2;
            list.add(r);
            n=n/2;
        }
        int i=0;
        int j=list.size()-1;
        int s=0;
        while(i<j){
            if(list.get(i)!=list.get(j)){
                s++;
                i++;
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        int res=2*s;
        return res;
    }
}