repeat=int(input())
score=0

def calc(n):
    if n==0: return 0
    if n==1: return 1
    else: return calc(n-1)+n

for i in range(repeat):
    answer=input().split('X')
    result=0
    for j in answer:
        result += calc(len(j))
    print(result)