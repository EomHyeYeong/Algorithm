lineList=[]
while True:
    lineList = list(map(int, input().split()))
    if sum(lineList)==0:
        break

    longLine=max(lineList)
    lineList.remove(longLine)
    longLine=pow(longLine, 2)
    otherLine = pow(lineList[0], 2) + pow(lineList[1], 2)
    if longLine==otherLine:
        print('right')
    else:
        print('wrong')