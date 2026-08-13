import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        
        return list;
    }
}