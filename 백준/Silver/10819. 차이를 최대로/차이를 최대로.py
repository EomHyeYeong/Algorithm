from itertools import permutations

n = int(input())
a = list(map(int, input().split()))
perm = list(permutations(a, n))
permMax = 0

for i in perm:
    permSum = 0
    for j in range(n-1):
        permSum += abs(i[j] - i[j+1])
    if permSum > permMax:
        permMax = permSum

print(permMax)