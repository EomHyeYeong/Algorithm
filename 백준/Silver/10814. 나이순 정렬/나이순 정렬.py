import sys

n = int(input())
members={}

for i in range(n):
    k, v = sys.stdin.readline().split()
    if int(k) in members:
        members[int(k)].append(v)
    else:
        members[int(k)] = [v]

memKeys=sorted(list(members.keys()))
for i in memKeys:
    memb=members[i]
    for j in memb:
        print(i, j)