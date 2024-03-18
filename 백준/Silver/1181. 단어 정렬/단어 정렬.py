import sys

wordList=[]
wordDict={}
lineCount = int(input())
for i in range(lineCount):
    word = sys.stdin.readline().strip()
    if word in wordList:
        continue
    wordList.append(word)
    if len(word) in wordDict:
        wordDict[len(word)].append(word)
    else:
        wordDict[len(word)] = [word]

wordLen=sorted(list(wordDict.keys()))
for i in wordLen:
    wordList = sorted(wordDict[i])
    for j in wordList:
        print(j)