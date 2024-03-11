cmp = '1 2 3 4 5 6 7 8'
inputData = input()

if cmp==inputData: print('ascending')
elif cmp==inputData[::-1]: print('descending')
else: print('mixed')