import sys
from collections import deque

def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    distance[y][x] = 0
    graph[y][x]=3

    while queue:
        qx, qy = queue.popleft()
        for i in range(4):
            mx = qx + movex[i]
            my = qy + movey[i]

            if mx<0 or mx>=m or my<0 or my>=n:
                continue
            if graph[my][mx]==0:
                continue
            if graph[my][mx]==3:
                continue
            distance[my][mx] = distance[qy][qx] + 1
            graph[my][mx] = 3
            queue.append((mx, my))

movex = [1, -1, 0, 0]
movey = [0, 0, 1, -1]
n, m = map(int, input().split())
distance=[[-1]*m for _ in range(n)]
graph=[]
for row in range(n):
    line = list(map(int, sys.stdin.readline().split()))
    graph.append(line)
for i in range(n):
    for j in range(m):
        if graph[i][j]==2:
            bfs(j, i)
        if graph[i][j]==0:
            distance[i][j] = 0

for i in distance:
    print(*i)