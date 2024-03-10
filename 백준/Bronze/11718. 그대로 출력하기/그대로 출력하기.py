import sys

while True:
    tmp = sys.stdin.readline();

    if tmp=='':
        break;
    else:
        print(tmp.strip('\n'))