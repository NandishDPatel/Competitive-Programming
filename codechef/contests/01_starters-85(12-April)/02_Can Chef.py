# 15km->1 liter
# x litre -> inside car
# 2y - distance
t=int(input())
for i in range(t):
    x,y=list(map(int,input().split()))
    totalDist = 2*y
    canCover = x*15
    if(canCover>=totalDist):
        print("YES")
    else:
        print("NO")