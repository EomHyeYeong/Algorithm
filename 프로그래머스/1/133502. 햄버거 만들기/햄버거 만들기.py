def packaging(list):
    for i in range(4):
        list.pop()

def solution(ingredient):
    comp = [1, 3, 2, 1]
    stack = []
    answer = 0
    
    for i in range(len(ingredient)):
        stack.append(ingredient[i])
        if len(stack) < 4:
            continue
        
        if stack[-1:-5:-1]==comp:
            packaging(stack)
            answer += 1
    
    return answer