a, b = map(int, input().split())
numList = list(map(int, input().split()))

for i in numList:
    if i<b: print(i, end=' ')