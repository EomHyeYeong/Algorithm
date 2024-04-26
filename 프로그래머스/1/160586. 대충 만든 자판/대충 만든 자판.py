def solution(keymap, targets):
    min_touch = {}
    for key in keymap:
        for i in range(len(key)):
            tmp = key[i]
            if tmp in min_touch:
                if i < min_touch[tmp]:
                    min_touch = i
            else:
                min_touch[tmp] = i
    
    answer = []
    for tar in targets:
        cnt = 0
        for ch in tar:
            if ch not  in min_touch:
                cnt = -1
                break
            cnt += min_touch[ch]
        answer.append(cnt)
    print(cnt)
        
    return answer