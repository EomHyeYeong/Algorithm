from collections import deque
import sys

mydeque = deque()
repeat = int(input())

for i in range(repeat):
    orders = list(sys.stdin.readline().split())
    order = orders[0]

    if order == 'push_back':
        mydeque.append(int(orders[1]))

    if order == 'push_front':
        mydeque.appendleft(int(orders[1]))

    if order == 'pop_front':
        if len(mydeque)==0: print(-1)
        else: print(mydeque.popleft())

    if order == 'pop_back':
        if len(mydeque)==0: print(-1)
        else: print(mydeque.pop())

    if order == 'size':
        print(len(mydeque))

    if order == 'empty':
        if len(mydeque)==0: print(1)
        else: print(0)

    if order == 'front':
        if len(mydeque)==0: print(-1)
        else: print(mydeque[0])

    if order == 'back':
        if len(mydeque)==0: print(-1)
        else: print(mydeque[-1])