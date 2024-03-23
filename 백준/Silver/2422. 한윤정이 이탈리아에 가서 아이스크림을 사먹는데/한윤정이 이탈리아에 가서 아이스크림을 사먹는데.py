from itertools import combinations
import sys

n, m = map(int, input().split())
ncomb = set(combinations(range(1, n+1), 3))
mdict = {}

for i in range(m):
    x, y = map(int, input().split())
    if x in mdict:
        mdict[x].append(y)
    else:
        mdict[x] = [y]
    if y in mdict:
        mdict[y].append(x)
    else:
        mdict[y] = [x]

        
nlist = list(ncomb)
for n1, n2, n3 in nlist:
    if n1 in mdict:
        if n2 in mdict[n1] or n3 in mdict[n1]:
            ncomb.remove((n1, n2, n3))
            continue
    if n2 in mdict:
        if n3 in mdict[n2]:
            ncomb.remove((n1, n2, n3))
print(len(ncomb))