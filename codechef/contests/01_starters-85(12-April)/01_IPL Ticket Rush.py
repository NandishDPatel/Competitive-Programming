# cook your dish here
t=int(input())
for i in range(t):
    n,m=list(map(int,input().split()))
    if(m>=n):
        print(0)
    else:
        print(n-m)