from bisect import bisect_left

class Solution(object):
    def gcdValues(self, nums, queries):
        MAX = max(nums)

        freq = [0] * (MAX + 1)
        for x in nums:
            freq[x] += 1

        cnt = [0] * (MAX + 1)

        # cnt[g] = numbers divisible by g
        for g in range(1, MAX + 1):
            for multiple in range(g, MAX + 1, g):
                cnt[g] += freq[multiple]

        exact = [0] * (MAX + 1)

        # exact[g] = pairs whose gcd is exactly g
        for g in range(MAX, 0, -1):
            c = cnt[g]
            exact[g] = c * (c - 1) // 2

            for multiple in range(g * 2, MAX + 1, g):
                exact[g] -= exact[multiple]

        prefix = []
        values = []

        s = 0
        for g in range(1, MAX + 1):
            if exact[g]:
                s += exact[g]
                prefix.append(s)
                values.append(g)

        ans = []
        for q in queries:
            idx = bisect_left(prefix, q + 1)
            ans.append(values[idx])

        return ans
        