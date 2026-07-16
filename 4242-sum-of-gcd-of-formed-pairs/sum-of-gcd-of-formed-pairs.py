class Solution(object):
    def gcdSum(self, nums):
        def gcd(a, b):
            while b:
                a, b = b, a % b
            return a

        prefixGcd = []
        mx = 0

        for x in nums:
            if x > mx:
                mx = x
            prefixGcd.append(gcd(x, mx))

        prefixGcd.sort()

        i = 0
        j = len(prefixGcd) - 1
        ans = 0

        while i < j:
            ans += gcd(prefixGcd[i], prefixGcd[j])
            i += 1
            j -= 1

        return ans