strCnt = int(input())

for i in range(strCnt):
    r, p = input().split()
    p = list(p)
    for j in p:
        print(j*int(r), end='')
    print()