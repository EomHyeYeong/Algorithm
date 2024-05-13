def solution(participant, completion):
    answer = ''
    part_dict = {}
    
    for name in participant:
        if name in part_dict:
            part_dict[name] += 1
        else:
            part_dict[name] = 1
    
    for name in completion:
        part_dict[name] -= 1
        
    for key, value in part_dict.items():
        if value != 0:
            return key
    