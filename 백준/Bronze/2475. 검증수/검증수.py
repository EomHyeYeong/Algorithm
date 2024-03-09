inputList = list(map(int, input().split()))
for i in range(len(inputList)):
    inputList[i] *= inputList[i]

print(sum(inputList)%10)