n = int(input())
bag = 0
repeat = n//5

for i in range(repeat, -1, -1):
    bag = 0
    bag += i
    nCalc=n
    nCalc -= (5*i)

    bag += nCalc//3
    nCalc = nCalc%3

    if nCalc==0:
        break
    bag = -1

print(bag)