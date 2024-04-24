from collections import deque

line = input().strip()
nlist = line.replace('+', '-').split('-')
numbers = deque(map(int, nlist))
orders = deque()

for char in line:
    if char=='+' or char=='-':
        orders.append(char)
stack = list()
localsum = numbers.popleft()
numbslen = len(numbers)

if numbslen==0:
    result = localsum

for i in range(numbslen):
    order = orders.popleft()
    number = numbers.popleft()

    if i == numbslen-1:
        # 마지막 원소 처리
        if order=='+':
            localsum += number
            stack.append(localsum)
            break
        else:
            stack.append(localsum)
            stack.append(number)
            break
    else:

        if order=='+':
            localsum += number
        else:
            stack.append(localsum)
            localsum = number
if len(stack) >= 2:
    
    tm = stack[1::]
    result = stack[0] - sum(tm)
elif len(stack) == 1:
    result = stack[0]
print(result)