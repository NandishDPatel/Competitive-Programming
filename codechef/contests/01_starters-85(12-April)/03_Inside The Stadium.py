# n-total balls faced,

t=int(input())
for i in range(t):
    n = int(input())
    runs = list(map(int,input().split()))
    count=0
    scoredRuns=0
    for j in range(n):
        scoredRuns+=runs[j]
        check = (scoredRuns/(j+1))*100
        if(check==100):
            count+=1
    print(count)