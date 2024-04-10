from itertools import combinations
from itertools import product

n, k = map(int, input().split())
locations = [0]*n

for i in range(n):
    x, y = map(int, input().split())
    locations[i] = (x, y)

shelters = list(combinations(locations, k)) # 모든 대피소 위치 경우의 수
globalMin = 10000000000 # 전체 거리 중 최소

for shelter in shelters: # 대피소 경우의 수 중 하나 선택
    newlocations = list(set(locations) - set(shelters)) # 대피소 아닌 집의 위치
    locMax = 0 # 집 사이의 거리 중 최대
    
    for loc in newlocations: # 한 집에 대해서 연산
        houseMin = 10000000000
        for sh in shelter: # 대피소 중 하나 선택
            distance = abs(loc[0] - sh[0]) + abs(loc[1] - sh[1])
            if houseMin > distance: # 대피소 중 가까운 대피소 거리를 저장
                houseMin = distance
        if locMax < houseMin: # 여러 집의 집-대피소 거리 중 최대값 저장
            locMax = houseMin
    if globalMin > locMax: # 집-대피소 최대 거리중 작은 거리를 저장
        globalMin = locMax 
    
print(globalMin)