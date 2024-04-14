from collections import deque
import sys

def getKevinBaconNumber(curr, tpeople):
    visit = [False]*(tpeople+1)
    visit[curr] = True
    
    queue = deque()
    friends = friend[curr]
    for f in friends:
        queue.append(f)
    queue.append(-1)

    distance = 1
    kbNum = 0
    while queue:
        n = queue.popleft()

        if n==-1:
            if len(queue)==0:
                break
            distance += 1
            queue.append(-1)
            continue
        if visit[n]==True:
            continue

        visit[n]=True
        friends = friend[n]
        for f in friends:
            queue.append(f)
        kbNum += distance

    return kbNum

n, m = map(int, input().split())
friend = {}
minkbNum = 50000
minPeopleNum = 0
for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    if a in friend:
        friend[a].append(b)
    else:
        friend[a] = [b]

    if b in friend:
        friend[b].append(a)
    else:
        friend[b] = [a]
friends = list(friend.keys())
friends.sort()
for key in friends:
    kbNum = getKevinBaconNumber(key, n)
    if minkbNum > kbNum:
        minkbNum = kbNum
        minPeopleNum = key
print(minPeopleNum)