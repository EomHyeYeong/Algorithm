def solution(k, m, score):
    answer = 0
    score.sort()
    
    while len(score) >= m:
        min_apple = score[-m]
        answer += min_apple * m
        del score[-1:-(m+1):-1]
    
    return answer