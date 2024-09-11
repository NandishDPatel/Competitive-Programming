# x/hour + y/extra hour
x,y,h = list(map(int,input().split()))
ans = 0
p1 = x*(1)
p2 = y*(h-1)
ans = p1 + p2
print(ans)