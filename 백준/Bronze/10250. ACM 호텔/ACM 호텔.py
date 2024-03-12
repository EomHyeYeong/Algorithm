repeat = int(input())
for i in range(repeat):
    h, w, n = map(int, input().split())

    if n%h==0: # 층이 맨 위층
        room = str(h)
        if n//h>=10:
            room+=str(n//h)
        else:
            room+='0'+str(n//h)
    else: # 층이 맨 위층이 아님
        room = str(n%h)
        if (n//h+1)>=10:
            room+=str(n//h+1)
        else:
            room+='0'+str(n//h+1)
    print(room)