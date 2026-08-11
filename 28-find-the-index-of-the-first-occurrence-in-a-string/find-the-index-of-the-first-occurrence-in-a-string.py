class Solution(object):
    def strStr(self, haystack, needle):
        n=len(haystack)
        m=len(needle)
        if needle in haystack:
            for i in range(n-m+1):
                if haystack[i:i+m]==needle:
                    return i
        else:
            return -1
        