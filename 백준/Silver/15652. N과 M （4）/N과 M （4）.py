from itertools import combinations_with_replacement as com

n, m = map(int, input().split())
nlist = list(com(range(1, n+1), m))
for i in nlist:
    print(*i)