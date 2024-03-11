inputStr = input()

for i in range(ord('a'), ord('z')+1):
    print(inputStr.find(chr(i)), end=' ')