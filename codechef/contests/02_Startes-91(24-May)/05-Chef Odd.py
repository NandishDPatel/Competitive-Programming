# cook your dish here
t = int(input())
for i in range(t):
    n,k = list(map(int,input().split()))
    rem_ele = n - (k*2)
    # print(rem_ele)
    if(rem_ele>=0):
        if(rem_ele%4==0 or rem_ele%4==3):
            print("YES")
        else:
            print("NO")
    else:
        print("NO")