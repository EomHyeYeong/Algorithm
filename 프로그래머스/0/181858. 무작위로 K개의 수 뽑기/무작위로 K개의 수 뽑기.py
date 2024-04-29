def solution(arr, k):
    result = [-1] * k
    idx = 0
    
    for i in arr:
        if i in result:
            continue
            
        if idx == k:
            break
        
        result[idx] = i
        idx += 1
        
    
    return result