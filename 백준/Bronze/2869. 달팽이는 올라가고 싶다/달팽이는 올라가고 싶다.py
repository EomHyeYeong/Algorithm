a, b, v = map(int, input().split())
days=1
v -= a

if v%(a-b)==0:
    days += v//(a-b)
else:
    days += v//(a-b)
    days +=1

print(days)