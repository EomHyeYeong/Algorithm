import sys

n = int(input())
distance=1
ns=6

if n//1 == 1:
    print(distance)
    sys.exit()
n -= 1


while n > 0:
    n -= ns
    ns += 6
    distance += 1

print(distance)