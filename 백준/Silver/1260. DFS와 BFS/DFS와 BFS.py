from collections import deque
import sys

def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

n, m, v = map(int, input().split())
line = {}
graph = [[] for i in range(n+1)]

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    if a in line:
        line[a].append(b)
    else:
        line[a] = [b]
    if b in line:
        line[b].append(a)
    else:
        line[b] = [a]
        
keys = list(line.keys())
keys.sort()
for i in keys:
    aline = line[i]
    aline.sort()
    for j in aline:
        graph[i].append(j)

dfs_visited = [False] * (n+1)
bfs_visited = [False] * (n+1)
dfs(graph, v, dfs_visited)
print()
bfs(graph, v, bfs_visited)