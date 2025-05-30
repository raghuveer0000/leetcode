from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Removes duplicates in-place and returns the number of unique elements.
        """
        if not nums:
            return 0

        # Pointer for the place to write the next unique element
        i = 0

        # Iterate through nums starting from the second element
        for j in range(1, len(nums)):
            if nums[j] != nums[i]:
                i += 1
                nums[i] = nums[j]

        # Number of unique elements is i + 1
        return i + 1
