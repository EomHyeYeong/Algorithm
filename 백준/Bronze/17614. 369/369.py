n = int(input())
clapCnt = 0
clabable = ['3', '6', '9']

map(lambda x: x==j, clabable)
for i in range(1, n+1):
    nsplit = list(str(i))
    if map(lambda x: x in nsplit, clabable):
        for j in nsplit:
            if j=='3' or j=='6' or j=='9':
                clapCnt += 1

print(clapCnt)