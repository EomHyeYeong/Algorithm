h, m = map(int, input().split())
timer = int(input())

m += timer
if m >= 60:
    h += m // 60
    m = m % 60

if h >= 24:
    h -= 24
print(h, m)