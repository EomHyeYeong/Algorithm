import sys

repeat = int(input())
doc = []
for i in range(repeat):
    n = int(sys.stdin.readline())
    if n==0:
        doc.pop()
    else:
        doc.append(n)

print(sum(doc))