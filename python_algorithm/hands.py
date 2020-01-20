//2n个人围着桌子，互相握手，但不允许握手交叉，问总共有几种握手方法？  
//  
//  
def f(n):  
    sumV = 0  
    if n==0: return 1  
    for i in range(n):  
        sumV += f(i) * f(n-1-i)  
    print(n,sumV)  
    return sumV  
n=6  
print(f(int(n/2)))  
