import sys

n, m = map(int, input().split())
ency = {}
for i in range(1, n+1):
    pokemon = sys.stdin.readline().strip()
    ency[i] = pokemon
revEncy = {v:k for k, v in ency.items()}

for i in range(m):
    order = sys.stdin.readline().strip()
    if order.isdigit():
        print(ency.get(int(order)))
    else:
        print(revEncy.get(order))