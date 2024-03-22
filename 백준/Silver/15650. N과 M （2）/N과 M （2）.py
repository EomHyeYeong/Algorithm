from itertools import combinations

n, m = map(int, input().split())
combs = list(combinations(range(1, n+1), m))
for i in combs:
    for j in i:
        print(j, end=' ')
    print()