class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;
        
        long maxValue = 0;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        
    
        maxLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i]);
        }
        
       
        maxRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i]);
        }
        
       
        for (int j = 1; j < n - 1; j++) {
            long left = maxLeft[j - 1];
            long right = maxRight[j + 1];
            maxValue = Math.max(maxValue, (left - nums[j]) * right);
        }
        
        return maxValue;
    }
}
