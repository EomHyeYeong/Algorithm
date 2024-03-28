n = int(input())
times = list(map(int, input().split()))
times.sort()
totalTime = [0] * n
curr = 0

for i in range(n):
    curr += times[i]
    totalTime[i] = curr

print(sum(totalTime))