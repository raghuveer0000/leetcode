class Solution {
    static void reverse(int []nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    static void rotateright(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    public void rotate(int[] nums, int k) {
        
        rotateright(nums,k);
        for(int res:nums){
            System.out.print(res+",");
        }
    }
}