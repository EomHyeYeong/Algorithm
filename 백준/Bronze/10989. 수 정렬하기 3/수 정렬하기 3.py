import sys

repeat = int(input())
numbers = {}
for i in range(repeat):
    num = int(sys.stdin.readline())
    if num in numbers:
        numbers[num] += 1
    else:
        numbers[num] = 1

snumbers = sorted(list(numbers.keys()))
for i in snumbers:
    iCount = numbers[i]
    for j in range(iCount):
        print(i)