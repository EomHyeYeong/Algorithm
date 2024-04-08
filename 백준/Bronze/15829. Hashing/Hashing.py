l = input()
strList = list(input())
cnt = 0
total = 0

for i in strList:
    total += (ord(i)-96) * pow(31, cnt)
    cnt+= 1
print(total)
