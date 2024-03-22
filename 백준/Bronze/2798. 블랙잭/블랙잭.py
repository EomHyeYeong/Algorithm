from itertools import combinations

n, m = map(int, input().split())
cards = list(map(int, input().split()))
combCards = list(combinations(cards, 3))
save = 0

for i in combCards:
    calc = sum(i)
    if calc <= m and calc > save :
        save = calc
print(save)