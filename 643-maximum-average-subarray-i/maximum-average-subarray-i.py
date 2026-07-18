class Solution(object):
    def findMaxAverage(self, nums, k):
        window_size=sum(nums[:k])
        max_value=window_size
        for i in range(k,len(nums)):
            window_size=window_size-nums[i-k]+nums[i]
            max_value=max(window_size,max_value)
        return max_value/float(k)
        