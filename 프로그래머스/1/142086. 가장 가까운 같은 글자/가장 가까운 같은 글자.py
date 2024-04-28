def solution(s):
    exist = {}
    answer = [-1] * len(s)
    
    for curr_idx in range(len(s)):
        char = s[curr_idx]
        if char in exist:
            diff = curr_idx - exist[char]
            answer[curr_idx] = diff
            exist[char] = curr_idx
        else:
            exist[char] = curr_idx
            
    
    return answer