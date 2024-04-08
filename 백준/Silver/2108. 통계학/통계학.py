import sys

n = int(input())
numb = [0] * n
total = 0
ndict = {}

for i in range(n):
    numb[i] = int(sys.stdin.readline())
    total += numb[i]

    if numb[i] in ndict:
        ndict[numb[i]] += 1
    else:
        ndict[numb[i]] = 1

vals = ndict.values()
maxVal = max(vals)
maxCnt = []
for k, v in ndict.items():
    if v ==  maxVal:
        maxCnt.append(k)

print(round(total / n))
numb.sort()
print(numb[(len(numb)-1) // 2])
if len(maxCnt)==1:
    print(maxCnt[0])
else:
    maxCnt.sort()
    print(maxCnt[1])
print(max(numb) - min(numb))
