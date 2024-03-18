import sys

stack = list()
lineCount = int(input())

for i in range(lineCount):
    inputLine = sys.stdin.readline().split()
    order = inputLine[0]
    if order=='push':
        stack.append(int(inputLine[1]))

    if order=='pop':
        if len(stack)==0:
            print(-1)
            continue
        print(stack.pop())

    if order=='size':
        print(len(stack))

    if order=='empty':
        if len(stack)==0:
            print(1)
        else:
            print(0)

    if order=='top':
        if len(stack)==0:
            print(-1)
            continue
        print(stack[len(stack)-1])