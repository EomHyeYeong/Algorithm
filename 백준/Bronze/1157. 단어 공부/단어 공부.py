wordDict = {}
inputStr = input().upper()

for i in range(len(inputStr)):
    if inputStr[i] in wordDict:
        wordDict[inputStr[i]] += 1
    else:
        wordDict[inputStr[i]] = 1

maxNum = -1
for key, value in wordDict.items():
    if value == maxNum:
        resultStr='?'
    if value > maxNum:
        maxNum=value
        resultStr=key
print(resultStr)