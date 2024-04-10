n = int(input())
clapCnt = 0
clabable = ['3', '6', '9']

map(lambda x: x==j, clabable)
for i in range(1, n+1):
    number = str(i)
    clapCnt += number.count('3')
    clapCnt += number.count('6')
    clapCnt += number.count('9')

print(clapCnt)