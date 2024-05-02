def solution(s):
    answer = ''
    pre_ch = ' '
    for ch in s:
        if pre_ch == ' ':
            answer += ch.upper()
        else:
            answer += ch.lower()
        
        pre_ch = ch
        
    return answer