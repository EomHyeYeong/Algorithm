def solution(name, yearning, photo):
    memory = {}
    memoryscore = [0]*len(photo)
    for i in range(len(name)):
        memory[name[i]] = yearning[i]
    
    for i in range(len(photo)):
        for pname in photo[i]:
            if pname in memory:
                memoryscore[i] += memory[pname]

    return memoryscore