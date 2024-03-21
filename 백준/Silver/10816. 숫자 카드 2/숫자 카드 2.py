cardCnt = input()
cards = list(map(int, input().split()))

cmpCnt = input()
cmps = list(map(int, input().split()))
cmpDict = {}

for i in cmps:
    cmpDict[i] = 0

for i in cards:
    if i in cmpDict:
        cmpDict[i] += 1

for i in cmps:
    print(cmpDict[i], end=' ')