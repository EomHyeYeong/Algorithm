import sys
from collections import deque

def bfs(n):
    queue = deque()
    queue.append(n)
    visited[n] = True

    if n not in graph:
        return

    while queue:
        n = queue.popleft()
        for i in graph.get(n):
            if visited[i]==True:
                continue
            visited[i] = True
            queue.append(i)

n, m = map(int, input().split())
if m==0:
    print(n)
    sys.exit()
visited = [False] * (n+1)
graph = {}
for i in range(m):
    n1, n2 = map(int, sys.stdin.readline().split())
    if n1 in graph:
        graph[n1].append(n2)
    else:
        graph[n1] = [n2]
    if n2 in graph:
        graph[n2].append(n1)
    else:
        graph[n2] = [n1]

cnt = 0
for i in range(1, n+1):
    if visited[i]==False:
        bfs(i)
        cnt+=1
print(cnt)