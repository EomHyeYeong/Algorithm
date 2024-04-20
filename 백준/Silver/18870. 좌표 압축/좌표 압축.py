n = int(input())
coordinates = list(map(int, input().split()))
cordsequence = list(set(coordinates))
cordsequence.sort()
corddict = {}

for i in range(len(cordsequence)):
    corddict[cordsequence[i]] = i

for i in coordinates:
    print(corddict[i], end=' ')