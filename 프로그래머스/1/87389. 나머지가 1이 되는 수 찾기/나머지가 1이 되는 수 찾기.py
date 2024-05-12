def solution(n):
    curr = 1
    
    while True:
        curr += 1
        if n % curr == 1:
            break
    return curr