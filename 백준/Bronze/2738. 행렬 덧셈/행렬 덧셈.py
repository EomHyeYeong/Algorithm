import sys

row, col = map(int, input().split())
mat1 = []
mat2 = []

for i in range(row):
    tmp=sys.stdin.readline()
    mat1.append(list(map(int, tmp.split())))
for i in range(row):
    tmp=sys.stdin.readline()
    mat2.append(list(map(int, tmp.split())))

for i in range(row):
    calcStr=''
    for j in range(col):
        calcStr += str(mat1[i][j]+mat2[i][j]) + ' '
    print(calcStr.rstrip())
