def solution(n):
    numbers = list(range(n+1))
    answer = 0
    
    for i in range(2, n+1):
        
        if numbers[i] != 0:
            cnt = 1
            answer += 1
            
            while(cnt*i < n+1):
                numbers[i*cnt] = 0
                cnt += 1
        
    
    return answer