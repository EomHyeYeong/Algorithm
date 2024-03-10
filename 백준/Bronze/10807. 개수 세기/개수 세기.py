n = input()
numList = list(map(int, input().split()))
v = int(input())
vCount=0

for i in numList:
    if i==v: vCount+=1
print(vCount)