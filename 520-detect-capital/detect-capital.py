class Solution(object):
    def detectCapitalUse(self, word):
        cap=0
        sm=0
        for i in range(len(word)):
            ch=word[i]
            if ch>='A' and ch<='Z':
                cap+=1
            else:
                sm+=1
        a=word[0]
        if cap==len(word):
            return True
        elif sm==len(word):
            return True
        elif a>='A' and a<='Z' and sm==len(word)-1:
            return True
        else:
            return False
        