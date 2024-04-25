from itertools import combinations

n, m = map(int, input().split())
graph = []
restaurant = []
house = []

for i in range(n):
    row = list(map(int, input().split()))
    for j in range(len(row)):
        if row[j] == 2:
            restaurant.append((i, j))
        if row[j] == 1:
            house.append((i, j))
        
    graph.append(row)

comb = list(combinations(restaurant, m))

minchickendistance = 100000
for case in comb:
    chickendistance = 0
    for hou in house:
        locmin = 10000
        for res in case:
            dx = abs(hou[1] - res[1])
            dy = abs(hou[0] - res[0])
            if dx+dy < locmin:
                locmin = dx+dy
        chickendistance += locmin
    if chickendistance < minchickendistance:
        minchickendistance = chickendistance

print(minchickendistance)