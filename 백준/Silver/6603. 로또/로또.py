from itertools import combinations
import sys

comb = []

while True:
    inputStr = sys.stdin.readline()
    if inputStr[0] == '0':
        break;
    if len(comb) != 0:
        print()
    k = int(inputStr[0])
    s = list(map(int, inputStr[2:].split()))
    comb = list(combinations(s, 6))
    for i in comb:
        for j in i:
            print(j, end=' ')
        print()