class Solution(object):
    def numJewelsInStones(self, J, S):
        """
        :type J: str
        :type S: str
        :rtype: int
        """
        num=0
        for i in S:
            if i in J:
                num+=1
        return num
        