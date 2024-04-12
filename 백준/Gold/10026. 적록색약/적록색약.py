from collections import deque
import copy

def normal(x, y):
    if ngrid[y][x]=='':
        return False
    
    queue = deque()
    queue.append((x, y))
    cmp = ngrid[y][x]
    ngrid[y][x]=''
    
    while queue:
        x, y = queue.popleft()

        for i in range(4):
            mx = x + movex[i]
            my = y + movey[i]

            if mx<0 or mx>n-1 or my<0 or my>n-1:
                continue
            if ngrid[my][mx]=='':
                continue

            if ngrid[my][mx]==cmp:
                queue.append((mx, my))
                ngrid[my][mx]=''
        
    return True

def notnormal(x, y):
    if nngrid[y][x]=='':
        return False
    
    queue = deque()
    queue.append((x, y))
    cmp = nngrid[y][x]
    if cmp=='R' or cmp=='G':
        cmp=['R', 'G']
        
    nngrid[y][x]=''
    
    while queue:
        x, y = queue.popleft()

        for i in range(4):
            mx = x + movex[i]
            my = y + movey[i]

            if mx<0 or mx>n-1 or my<0 or my>n-1:
                continue
            if nngrid[my][mx]=='':
                continue

            if nngrid[my][mx]in cmp:
                queue.append((mx, my))
                nngrid[my][mx]=''
        
    return True

movex = [1, -1, 0, 0]
movey = [0, 0, 1, -1]

n = int(input())
ngrid = ['']*n
for i in range(n):
    ngrid[i] = list(input())
nngrid = copy.deepcopy(ngrid)
normalCnt = 0
notnormalCnt = 0

for i in range(n):
    for j in range(n):
        if normal(i, j):
            normalCnt+=1
        if notnormal(i, j):
            notnormalCnt+=1
print(normalCnt, notnormalCnt)
