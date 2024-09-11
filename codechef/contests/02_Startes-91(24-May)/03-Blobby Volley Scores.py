# cook your dish here
# alice - server, bob-reciever
t = int(input())
for i in range(t):
    alice = 0
    bob = 0
    n = int(input())
    s = input()
    lst = list(s)
    last_win = 'A'
    for j in range(n):
        c_win = lst[j]
        if(c_win == last_win == 'A'):
            alice += 1
            last_win = 'A'
        elif(c_win == last_win == 'B'):
            bob += 1
            last_win = 'B'
        elif(c_win == 'A' and last_win == 'B'):
            last_win = 'A'
        else:
            last_win = 'B'
    print(alice,bob)