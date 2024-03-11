calc=1
calcDict={}

for i in range(3):
    calc *= int(input())
calc = list(str(calc))

for i in calc:
    if i in calcDict:
        calcDict[i] += 1
    else:
        calcDict[i] = 1

for i in range(10):
    if str(i) in calcDict:
        print(calcDict[str(i)])
    else:
        print(0)