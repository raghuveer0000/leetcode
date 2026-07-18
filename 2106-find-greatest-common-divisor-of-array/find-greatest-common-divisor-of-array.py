class Solution(object):
    def findGCD(self, nums):
        nums=sorted(nums)
        l=len(nums)-1
        a=nums[0]
        b=nums[l]
        ans=1
        for i in range(1,min(a,b)+1):
            if a%i==0 and b%i==0:
                ans=i
        return ans
        