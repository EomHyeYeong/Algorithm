from collections import deque
import sys

def bfs(ripe):
    queue = deque()
    day=0
    for x, y in ripe:
        queue.append((x, y))
    queue.append(())

    while queue:
        if len(queue[0])==0:
            if len(queue)==1:
                return day
            day += 1
            queue.popleft()
            queue.append(())
            continue
        x, y = queue.popleft()

        for i in range(4):
            mx = x + movex[i]
            my = y + movey[i]

            if mx<0 or mx >=m or my<0 or my>=n:
                continue
            if tomatoes[my][mx]==1 or tomatoes[my][mx]== -1:
                continue

            queue.append((mx, my))
            tomatoes[my][mx] = 1


movex=[1, -1, 0, 0]
movey=[0, 0, 1, -1]     

m, n = map(int, input().split())
tomatoes = [0]*n
ripe = []
for i in range(n):
    tomatoes[i] = list(map(int, sys.stdin.readline().split()))
    for j in range(m):
        if tomatoes[i][j]==1:
            ripe.append((j, i))
day = bfs(ripe)
for i in range(n):
    for j in range(m):
        if tomatoes[i][j]==0:
            print(-1)
            sys.exit()
print(day)