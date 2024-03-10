scoreList={'A':4.0, 'B':3.0, 'C':2.0, 'D':1.0}
score=input()

if score=='F': print(0.0)
elif score[1]=='+':
    print(scoreList[score[0]]+0.3)
elif score[1]=='0':
    print(scoreList[score[0]])
else:
    print(scoreList[score[0]]-0.3)