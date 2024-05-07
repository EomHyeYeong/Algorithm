from collections import deque

def solution(n):
    numbers = deque()
    cnt = 0
    
    for i in range(1, n+1):
        numbers.append(i)
        
        while(sum(numbers) > n):
            numbers.popleft()
        
        if sum(numbers) == n:
            cnt += 1
    
    return cnt