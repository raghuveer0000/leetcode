class Solution(object):
    def searchRange(self, nums, target):
        r=[]
        if target not in nums:
            return [-1,-1]
        else:
            first=nums.index(target)
            last=len(nums)-1-nums[::-1].index(target)
            r.append(first)
            r.append(last)
            return r