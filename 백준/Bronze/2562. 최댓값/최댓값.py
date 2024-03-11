maxNumber=0
maxCount=0
for i in range(9):
    compNumber = int(input())
    if maxNumber < compNumber:
        maxNumber = compNumber
        maxCount = i + 1
print(maxNumber)
print(maxCount)