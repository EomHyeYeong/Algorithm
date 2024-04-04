import sys
n, m = map(int, input().split())
nothear = set()
nhns = set()

cnt=0
for i in range(n+m+1):
    if i==n:
        continue
    if i<n:
        nothear.add(sys.stdin.readline().strip())
    if i>n:
        notsee = sys.stdin.readline().strip()
        if notsee in nothear:
            cnt+=1
            nhns.add(notsee)


print(cnt)
nothearnotsee = list(nhns)
nothearnotsee.sort()
for i in nothearnotsee:
    print(i)
