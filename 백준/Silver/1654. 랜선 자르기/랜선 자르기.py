import sys

k, n = map(int, input().split())
lineLength = [0] * k
for i in range(k):
    lineLength[i] = int(sys.stdin.readline())

minLength = 1
maxLength = max(lineLength)
saveLength = [0, 0] # 자른 길이, 개수

if n==1:
    print(lineLength[0])
    sys.exit()

while minLength <= maxLength:
    midLength = (minLength + maxLength) // 2
    cnt = 0

    for line in lineLength:
        cnt += line // midLength

    if cnt >= n:
        minLength = midLength + 1
        if saveLength[0] < midLength:
            saveLength[0] = midLength
            saveLength[1] = cnt
    else:
        maxLength = midLength - 1

print(saveLength[0])