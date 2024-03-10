import sys

caseCount=int(input())
for i in range(caseCount):
    a, b=map(int, sys.stdin.readline().split())
    print(a+b)