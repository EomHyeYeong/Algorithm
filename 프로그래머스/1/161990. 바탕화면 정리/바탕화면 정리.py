def solution(wallpaper):
    xmin, xmax = 100, 0
    ymin, ymax = 100, 0
    
    for i in range(len(wallpaper)): # x
        row = list(wallpaper[i])
        for j in range(len(row)):   # y
            if row[j] == '#':
                if i<xmin: xmin=i
                if i>xmax: xmax=i
                if j<ymin: ymin=j
                if j>ymax: ymax=j

    return [xmin, ymin, xmax+1, ymax+1]