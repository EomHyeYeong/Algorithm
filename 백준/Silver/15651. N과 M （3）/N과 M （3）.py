from itertools import product

n, m = map(int, input().split())
nlist = list(product(range(1, n+1), repeat=m))
for i in nlist:
    print(*i)