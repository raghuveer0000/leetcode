import java.util.Arrays;
class Solution {
    public int findGCD(int[] nums) {
        int l=nums.length-1;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[l];
        int ans=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if (a%i==0 && b%i==0){
                ans=i;
            }
        }
        return ans;
    }
    
}