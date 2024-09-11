# cook your dish here
t = int(input())

for i in range(t):
    seat = int(input())
    if(seat<=10):
        print("Lower Double")
    elif(seat<=15):
        print("Lower Single")
    elif(seat<=25):
        print("Upper Double")
    else:
        print("Upper Single")