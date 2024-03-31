import sys
from collections import deque

def bfs(x, y):
    if not field[y][x]:
        return False
    
    queue = deque()
    queue.append((x, y))
    field[y][x] = 0

    while(queue):
        x, y = queue.popleft()
        for i in range(4):
            mx = x + movex[i]
            my = y + movey[i]

            if mx<0 or mx>=m or my<0 or my>=n:
                continue
            if not field[my][mx]:
                continue
            queue.append((mx, my))
            field[my][mx] = 0
    return True

movex = [1, -1, 0, 0]
movey = [0, 0, 1, -1]
tc = int(input())
for case in range(tc):
    cnt = 0
    m, n, k = map(int, input().split())

    field = [[0]*m for _ in range(n)]
    
    for i in range(k):
        x, y = map(int, sys.stdin.readline().split())
        field[y][x] = 1
    
    for i in range(n):
        for j in range(m):
            result = bfs(j, i)
            if result:
                cnt += 1   
    print(cnt)