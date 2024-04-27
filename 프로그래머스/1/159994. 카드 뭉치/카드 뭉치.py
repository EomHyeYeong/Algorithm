def solution(cards1, cards2, goal):
    cnt_cards1 = 0
    cnt_cards2 = 0
    cnt_goal = 0
    
    while True:
        if cnt_goal == len(goal):
            break
            
        if cnt_cards1 < len(cards1):
            if cards1[cnt_cards1] == goal[cnt_goal]:
                cnt_cards1 += 1
                cnt_goal += 1
                continue
        if cnt_cards2 < len(cards2):
            if cards2[cnt_cards2] == goal[cnt_goal]:
                cnt_cards2 += 1
                cnt_goal += 1
                continue
        
        return "No"
    
    return "Yes"