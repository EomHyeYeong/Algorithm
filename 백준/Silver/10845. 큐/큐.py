import sys

cnt=int(input())
queue=[]

for i in range(cnt):
    orders=list(sys.stdin.readline().split())
    order=orders[0]
    if order=='push':
        queue.append(int(orders[1]))

    if order=='pop':
        if len(queue)==0:
            print(-1)
            continue
        print(queue.pop(0))

    if order=='size':
        print(len(queue))

    if order=='empty':
        if len(queue)==0: print(1)
        else: print(0)

    if order=='front':
        if len(queue)==0:
            print(-1)
            continue
        print(queue[0])
        

    if order=='back':
        if len(queue)==0:
            print(-1)
            continue
        print(queue[len(queue)-1])