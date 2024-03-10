import sys

while True:
    tmp=sys.stdin.readline();

    if tmp=='':
        break;
    else:
        a, b = map(int, tmp.split())
        print(a+b)