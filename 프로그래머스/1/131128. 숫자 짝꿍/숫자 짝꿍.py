def solution(X, Y):
    maxlen = max(len(X), len(Y))
    cnt_xdict = {}
    cnt_ydict = {}
    
    for i in range(maxlen):
        if len(X) > i:
            if X[i] in cnt_xdict:
                cnt_xdict[X[i]] += 1
            else:
                cnt_xdict[X[i]] = 1
        
        if len(Y) > i:
            if Y[i] in cnt_ydict:
                cnt_ydict[Y[i]] += 1
            else:
                cnt_ydict[Y[i]] = 1
    
    x = set(cnt_xdict.keys())
    y = set(cnt_ydict.keys())
    answer = ''
    
    inter = list(x & y)
    inter.sort(reverse=True)
    if len(inter)==0:
        return "-1"
    
    for i in inter:
        xcnt = cnt_xdict[i]
        ycnt = cnt_ydict[i]
        answer += str(i) * min(xcnt, ycnt)
    
    slen = len(answer)
    if answer == '0'*slen:
        return '0'

    return answer