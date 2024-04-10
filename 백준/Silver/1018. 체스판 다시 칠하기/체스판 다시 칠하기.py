n, m = map(int, input().split())
chess = [0]*n
rows = n - 8 + 1
cols = m - 8 + 1
locmin = 100000000
globalmin = 100000000

for i in range(n):
    chess[i] = list(input())

for cnt in range(2):
    change = [[0]*cols for _ in range(rows)]
    bw=['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W']
    if cnt!=0:
        bw=bw[::-1]
        
    for row in range(rows):
        cpyrow = chess[row: row+8]
        for col in range(cols):
            for i in range(8):
                cpycol = cpyrow[i][col: col+8]
                for j in range(8):
                    if cpycol[j]!=bw[j]:
                        change[row][col]+=1
                bw=bw[::-1]
        locmin = min(change[row])
        if locmin<globalmin:
            globalmin = locmin

print(globalmin)