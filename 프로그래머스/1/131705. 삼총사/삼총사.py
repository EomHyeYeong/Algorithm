from itertools import combinations

def solution(number):
    friends = combinations(number, 3)
    bestfriends = 0
    for f in friends:
        if sum(f)==0:
            bestfriends += 1
    
    return bestfriends