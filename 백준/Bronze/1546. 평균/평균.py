cnt=int(input())
scoreList=list(map(int, input().split()))
maxScore=max(scoreList)

for i in range(cnt):
    scoreList[i] = scoreList[i]/maxScore*100

print(sum(scoreList)/len(scoreList))