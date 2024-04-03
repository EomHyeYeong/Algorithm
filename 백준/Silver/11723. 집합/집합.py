import sys
m = int(input())
s = set()

for i in range(m):
    order = list(sys.stdin.readline().split())

    if order[0]=='add':
        s.add(int(order[1]))

    if order[0]=='remove' and int(order[1]) in s:
        s.remove(int(order[1]))

    if order[0]=='check':
        if int(order[1]) in s:
            print(1)
        else: 
            print(0)

    if order[0]=='toggle':
        if int(order[1]) in s:
            s.remove(int(order[1]))
        else:
            s.add(int(order[1]))
    
    if order[0]=='all':
        s = set(range(1, 21))
    
    if order[0]=='empty':
        s = set()
