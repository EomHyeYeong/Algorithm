import sys
t = int(input())

for i in range(t):
    case = int(sys.stdin.readline())
    if case == 0:
        print('1 0')
        continue
    if case == 1:
        print('0 1')
        continue

    plist=[0, 1]
    for j in range(case-1):
        zero = plist[0]
        one = plist[1]
        plist = [one, zero+one]

    print(*plist)