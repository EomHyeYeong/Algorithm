from collections import deque
import sys

testcase = int(input())

for i in range(testcase):
    order = list(sys.stdin.readline().strip('\n'))
    listlength = int(sys.stdin.readline())
    acstr = sys.stdin.readline().strip('[]\n')
    error = False
    isR = False
    if len(acstr)==0:
        aclist = deque()
    else:
        aclist = deque(map(int, acstr.split(',')))

    for ord in order:
        if ord=='R':
            isR = ~isR
        else:
            if len(aclist)==0:
                error = True
                break
            if ~isR:
                aclist.popleft()
            else:
                aclist.pop()
    if error:
        print('error')
        continue

    aclist = list(aclist)
    if isR:
        aclist = aclist[::-1]
    print('[', end='')
    for i in range(len(aclist)):
        if i==len(aclist)-1:
            print('{}'.format(aclist[i]), end='')
            break
        print('{},'.format(aclist[i]), end='')
    print(']')