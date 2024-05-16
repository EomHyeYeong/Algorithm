def solution(k, tangerine):
    answer = 0
    tangerine_cnt = {}
    max_cnt = 0
    
    for t in tangerine:
        if t in tangerine_cnt:
            tangerine_cnt[t] += 1
        else:
            tangerine_cnt[t] = 1
        if tangerine_cnt[t] > max_cnt:
            max_cnt = tangerine_cnt[t]
            
    cnt_list = [[] for i in range(max_cnt+1)]
    for key, v in tangerine_cnt.items():
        cnt_list[v].append(key)
    
    cnt = 0
    for idx in range(max_cnt, 0, -1):
        for i in cnt_list[idx]:
            k -= idx
            cnt += 1
            
            if k <= 0:
                break
        if k<= 0:
            break
    
    return cnt