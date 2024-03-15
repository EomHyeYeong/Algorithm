import sys

numCount=int(input())
numList=[]
for i in range(numCount):
    num=sys.stdin.readline()
    numList.append(int(num))
numList.sort();
for i in numList:
    print(i)