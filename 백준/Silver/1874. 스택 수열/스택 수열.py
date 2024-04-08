from collections import deque
import sys

n = int(input())
mk = deque(range(1, n+1))
sequence = [0] * n
stack = []
order = []

for i in range(n):
    sequence[i] = int(sys.stdin.readline())

sequence = deque(sequence)

while sequence:
    stack.append(mk.popleft())
    order.append("+")
    
    while stack[-1]==sequence[0]:
        stack.pop()
        sequence.popleft()
        order.append("-")
        if len(stack)==0 or len(sequence)==0:
            break
        
    if len(stack)==0 and len(sequence)==0:
            break

    if len(mk)==0 and stack[-1]!=sequence[0]:
        print("NO")
        sys.exit()

for i in order:
    print(i)
