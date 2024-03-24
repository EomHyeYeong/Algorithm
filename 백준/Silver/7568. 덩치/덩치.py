import sys

n = int(input())
ranking = [n] * n
info = []

for i in range(n):
    w, h = map(int, input().split())
    info.append([w, h])


for i in range(n):
    for j in range(i+1, n):
        weight = info[i][0] - info[j][0]
        height = info[i][1] - info[j][1]

        if weight>0 and height>0:
            ranking[i] -= 1
        elif weight<0 and height<0:
            ranking[j] -= 1
        else:
            ranking[i] -= 1
            ranking[j] -= 1

print(*ranking)