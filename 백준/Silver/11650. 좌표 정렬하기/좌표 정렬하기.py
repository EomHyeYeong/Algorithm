import sys

cnt=int(input())
points=[]
for i in range(cnt):
    point=list(map(int, sys.stdin.readline().split()))
    points.append(point)

points.sort(key=lambda x:x[1])
points.sort(key=lambda x:x[0])
for x, y in points:
    print(x, y)