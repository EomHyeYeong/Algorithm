import sys
repeat=int(input())

for i in range(repeat):
    paren=sys.stdin.readline().strip()
    paren=list(paren)
    stack=[]
    exp=False
    for j in range(len(paren)):
        prt=paren[j]
        if prt=='(':
            stack.append(prt)
        else:
            try:
                stack.pop()
            except:
                exp=True
                break

    if exp:
        print('NO')
        
    elif len(stack)==0 and j==len(paren)-1:
        print('YES')
    else:
        print('NO')