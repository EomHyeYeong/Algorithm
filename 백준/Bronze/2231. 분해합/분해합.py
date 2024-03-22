import sys

n = int(input())
digit = len(str(n)) * 9
ncpy = n - digit

if ncpy < 0:
    ncpy = 1

while ncpy != n:
    div = list(map(int, str(ncpy)))
    result = ncpy + sum(div)

    if result==n:
        print(ncpy)
        sys.exit()
    ncpy += 1

print(0)