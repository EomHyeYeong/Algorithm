def solution(s, skip, index):
    answer = ''
    
    for ch in s:
        
        int_ch = ord(ch)
        cnt = 0
        
        while cnt < index:
            if int_ch == 122:
                int_ch -= 26
                
            int_ch += 1
            if chr(int_ch) in skip:
                continue
                
            cnt += 1
            
        answer += chr(int_ch)
    
    return answer