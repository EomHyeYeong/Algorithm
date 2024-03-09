inputData=int(input())
cycle=0
newNum=-1

if inputData<10: inputData *=10

while inputData!=newNum:
    if cycle==0: newNum=inputData
    cycle+=1
    
    a = newNum//10
    b = newNum%10
    c = a+b

    newNum=int(str(b)+str(c%10))

print(cycle)
