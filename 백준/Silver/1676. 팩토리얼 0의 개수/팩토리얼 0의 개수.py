n = int(input())
factorial = 1

for i in range(1, n+1):
    factorial *= i

cnt=0
while True:
    div = factorial % 10
    factorial = factorial // 10
    if div==0:
        cnt+=1
        continue
    break
print(cnt)