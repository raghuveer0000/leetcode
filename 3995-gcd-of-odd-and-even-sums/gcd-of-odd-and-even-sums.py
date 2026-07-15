class Solution(object):
    def gcdOfOddEvenSums(self, n):
        o=n*n
        e=n*(n+1)
        while e!=0:
            o,e=e,o%e
        return o

        