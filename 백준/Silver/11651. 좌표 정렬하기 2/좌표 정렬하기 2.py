listSize = int(input())
dotList=[]
for i in range(listSize):
    dotList.append(list(map(int, input().split())))

dotList.sort(key=lambda x:x[0])
dotList.sort(key=lambda x:x[1])
for i, j in dotList:
    print(i, j)