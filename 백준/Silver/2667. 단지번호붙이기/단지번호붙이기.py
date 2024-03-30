from collections import deque

def bfs(x, y):
    if graph[x][y]==0:
        return 0

    cnt = 0
    queue = deque()
    queue.append((x, y))
    graph[x][y] = 0

    while queue:
        x, y = queue.popleft()
        cnt+=1
        for i in range(4):
            xm = x + xMove[i]
            ym = y + yMove[i]

            if xm<0 or xm>=n or ym<0 or ym>=n:
                continue
            if graph[xm][ym] == 0:
                continue
            
            graph[xm][ym] = 0
            queue.append((xm, ym))
    return cnt


xMove = [1, -1, 0, 0]
yMove = [0, 0, 1, -1]
graph = []
house = []
n = int(input())
for i in range(n):
    line = list(map(int, input()))
    graph.append(line)

for i in range(n):
    for j in range(n):
        result = bfs(i, j)
        if result != 0:
            house.append(result)
house.sort()
print(len(house))
for i in house:
    print(i)