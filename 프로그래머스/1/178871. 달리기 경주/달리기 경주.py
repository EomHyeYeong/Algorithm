def solution(players, callings):
    ranking = {}
    rank = 1
    for name in players:
        ranking[name] = rank
        rank += 1
    
    for name in callings:
        otrank = ranking[name]
        overtakeTo = players[otrank-2]
        players[otrank-1] = overtakeTo
        players[otrank-2] = name
        
        ranking[name] = otrank-1
        ranking[overtakeTo] = otrank
    
    return players