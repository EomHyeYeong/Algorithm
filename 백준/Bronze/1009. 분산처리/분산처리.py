inputData=int(input())

for i in range(inputData):
    a, b = map(int, input().split())
    c=pow(a, b, 10)%10
    if c==0:
        print(10)
    else:
        print(c)

