class Solution(object):
    def uniqueXorTriplets(self, nums):
        MAXX = 2048

        dp = [False] * MAXX
        dp[0] = True

        for _ in range(3):
            new = [False] * MAXX
            for x in range(MAXX):
                if dp[x]:
                    for v in nums:
                        new[x ^ v] = True
            dp = new

        return sum(dp)