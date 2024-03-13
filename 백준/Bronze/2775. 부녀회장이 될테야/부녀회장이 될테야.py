repeat = int(input())

while (repeat != 0):
    k = int(input())
    n = int(input())

    apart=list()
    apart.append(list(range(1, n+1)))

    for i in range(k):
        room=list()
        pCount=0
        for j in range(n):
            pCount+= apart[i][j]
            room.append(pCount)
        apart.append(room)
    print(sum(apart[k-1]))
    repeat-=1