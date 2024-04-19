def solution(s):
    answer = True
    s = list(s)
    stack = list()
    
    for ch in s:
        if ch=='(':
            stack.append(ch)
        else:
            if len(stack)==0:
                return False
            stack.pop()
            
    if len(stack)!=0:
        return False

    return True