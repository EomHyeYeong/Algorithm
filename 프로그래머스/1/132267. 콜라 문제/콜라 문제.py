def solution(a, b, n):
    answer = 0
    
    while n >= a:
        cng = n // a
        remain = n % a
        answer += (cng * b)
        n = cng * b + remain
    
    return answer