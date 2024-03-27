n = int(input())
cntList = [0] * (n+1)

for i in range(2, n+1):
    cntList[i] = cntList[i-1] + 1

    if i%2==0:
        cntList[i] = min(cntList[i], cntList[i//2]+1)
    if i%3==0:
        cntList[i] = min(cntList[i], cntList[i//3]+1)
print(cntList[n])