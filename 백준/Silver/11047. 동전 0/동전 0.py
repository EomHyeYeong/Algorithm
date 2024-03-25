n, k = map(int, input().split())
value=[]

for i in range(n):
    value.append(int(input()))
value.sort(reverse=True)
coinCount=0

for i in value:
    coinCount += k//i
    k %= i

    if k==0:
        break
print(coinCount)