class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>res1=new HashSet<>();
        for(int num:nums2){
            set.add(num);
        }
        for(int num:nums1){
            if(set.contains(num)){
                res1.add(num);
            }
        }
        int[] res=new int[res1.size()];
        int i = 0;
        for (int val : res1) {
            res[i++] = val;
        }

        return res;
    }
}