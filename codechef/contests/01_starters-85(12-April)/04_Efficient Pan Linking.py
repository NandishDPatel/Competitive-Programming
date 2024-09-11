# 20-officers
# n-applicants
#
t=int(input())
for i in range(t):
    x=input()
    y=list(x)
    # print(y)
    if(len(y)==1):
        num=int(y[0])
        print(num)
    else:
        num1=y[-2]+y[-1]
        num2=int(num1)
        print(num2%20)