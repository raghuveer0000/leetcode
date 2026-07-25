class Solution(object):
    def maxProduct(self, n):
        s=1
        k=[]
        while n>0:
            r=n%10
            k.append(r)
            n=n/10
        k=sorted(k)
        n=len(k)
        return k[n-1]*k[n-2]
        

        