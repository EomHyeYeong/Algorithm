from itertools import combinations
from itertools import product

n, k = map(int, input().split())
locations = [0]*n
for i in range(n):
    x, y = map(int, input().split())
    locations[i] = (x, y)

shelters = list(combinations(locations, k))
sh_loc = []
globalMin = 100000


for shelter in shelters:
    newlocations = list(set(locations) - set(shelters))
    locMax = 0
    
    for loc in newlocations: # 한 집에 대해서
        houseMin = 1000000
        for sh in shelter:
            distance = abs(loc[0] - sh[0]) + abs(loc[1] - sh[1])
            if houseMin > distance:
                houseMin = distance
        if locMax < houseMin: # 집-대피소 거리 중 최대값 저장
            locMax = houseMin
    if globalMin > locMax:
        globalMin = locMax      
    
print(globalMin)