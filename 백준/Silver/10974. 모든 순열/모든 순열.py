from itertools import permutations

n = int(input())
perm = list(permutations(range(1, n+1), n))
for i in perm:
    print(*i)