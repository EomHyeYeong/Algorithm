inputList=[]

for i in range(9):
    inputList.append(int(input()))
maxNumber = max(inputList)
print(maxNumber)
print(inputList.index(maxNumber)+1)
