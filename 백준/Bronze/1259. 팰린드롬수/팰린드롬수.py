while True:
    inputNum=input()
    if inputNum=='0':
        break;
    if inputNum==inputNum[::-1]:
        print('yes')
    else:
        print('no')