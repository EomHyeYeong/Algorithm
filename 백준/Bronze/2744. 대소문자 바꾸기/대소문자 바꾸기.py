inputStr=input()

inputStr=list(inputStr)
for i in range(len(inputStr)):
    if inputStr[i].isupper():
        inputStr[i] = inputStr[i].lower()
    else:
        inputStr[i] = inputStr[i].upper()
print(''.join(inputStr))