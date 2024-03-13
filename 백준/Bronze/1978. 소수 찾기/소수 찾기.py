numSize=input()
inputList=list(map(int, input().split()))
maxInput=max(inputList)

primeList=list(range(2, maxInput+1))
primeCnt=0

for i in range(len(primeList)):
    if primeList[i]==0:
        continue
    for j in range(i+1, len(primeList)):
        if primeList[j]%primeList[i]==0:
            primeList[j]=0

for i in inputList:
    if i in primeList:
        primeCnt+=1
print(primeCnt)