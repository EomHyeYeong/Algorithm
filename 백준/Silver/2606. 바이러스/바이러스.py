import sys

def dfs(n):
    visited[n] = True
    if n in graph:
        for i in graph[n]:
            if not visited[i]:
                dfs(i)

computerCnt = int(input())
networkCnt = int(input())
graph = {}
visited = [False] * (computerCnt + 1)
for i in range(networkCnt):
    n, m = map(int, input().split())
    if n in graph: graph[n].append(m)
    else: graph[n] = [m]

    if m in graph: graph[m].append(n)
    else: graph[m] = [n]
dfs(1)
print(visited.count(True)-1)