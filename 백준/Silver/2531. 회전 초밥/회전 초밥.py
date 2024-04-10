import sys

n, d, k, c = map(int, input().split())
belt = [0]*n
for i in range(n):
    belt[i] = int(sys.stdin.readline())

maxCount = 0
for i in range(n):
    if i+k > n-1:
        eats = belt[i:] + belt[:(i+k)-n]
    else:
        eats = belt[i:i+k]
    eats = set(eats)
    cnt = len(eats)
    if c not in eats:
        cnt += 1

    if maxCount < cnt:
        maxCount = cnt
print(maxCount)