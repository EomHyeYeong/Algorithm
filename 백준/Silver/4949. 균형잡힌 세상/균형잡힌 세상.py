import sys

while True:
    readline = sys.stdin.readline().strip('\n')
    if readline == '.':
        break

    stack = []
    readline = list(readline)
    status = 0
    for char in readline:
        if char=='(':
            stack.append('(')
        elif char=='[':
            stack.append('[')
        
        elif char==')':
            if len(stack)==0:
                status=-1
                break
            spop = stack.pop()
            if spop!='(':
                status=-1
                break
        elif char==']':
            if len(stack)==0:
                status=-1
                break
            spop = stack.pop()
            if spop!='[':
                status=-1
                break

    if len(stack)!=0:
        status=-1
    if status==0: print('yes')
    else: print('no')