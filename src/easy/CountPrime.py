import math
class Solution:
    def countPrimes(self, n: 'int') -> 'int':
        num=0
        for i in range(1,n):
            #print(self.isPrime(i))
            num += 1 if self.isPrime(i) else 0
        return num
    def isPrime(self,n):
        if n == 1 : return False
        for i in range(2,math.ceil(math.sqrt(n))+1):
            if n%i == 0 and n!=i:
                return False
        return True
a = Solution()
print(a.countPrimes(10))


class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        num=0
        a = [1] *n
        for i in range(2,n):
            if a[i]:
                num+=1
                j=2
                while i*j<n:
                    a[i*j]=0
                    j+=1
        return num