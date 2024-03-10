import sys

studentNumber=list(range(1,31))
while True:
    submit= sys.stdin.readline()
    if submit=="":
        break
    studentNumber.remove(int(submit))

for i in studentNumber: print(i)
